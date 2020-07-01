package com.jpoint.compressor.impl.v2;

import com.jpoint.compressor.StringCompressor;

import java.util.Arrays;


public class StringCompressorV2 implements StringCompressor {


    @Override
    public String compress(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        final char[] sb = new char[str.length()];
        char symbol = str.charAt(0);
        int lastIndex = 0;
        int i = 1;
        int j = 0;
        while (i < str.length()) {
            final char nextChar = str.charAt(i);
            if ((symbol ^ nextChar) != 0) {
                final int count = i - lastIndex;
                if (count != 1) {
                    sb[j++] = (char)(count + '0');
                }
                sb[j++] = symbol;
                symbol = nextChar;
                lastIndex = i;
            }
            i = i + 1;
        }
        int count = str.length() - lastIndex;
        if (count != 1) {
            sb[j++] = (char)(count + '0');
        }
        sb[j++] = symbol;
        return String.valueOf(sb, 0, j);
    }
}
