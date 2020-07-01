package com.jpoint.compressor.impl.v1;

import com.jpoint.compressor.StringCompressor;

public class StringCompressorV1 implements StringCompressor {

    @Override
    public String compress(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char symbol = str.charAt(0);
        int lastIndex = 0;
        for (int i = 1; i < str.length(); i++) {
            char nextChar = str.charAt(i);
            if (symbol != nextChar) {
                int count = i - lastIndex;
                if (count != 1) {
                    sb.append(count);
                }
                sb.append(symbol);
                symbol = nextChar;
                lastIndex = i;
            }
        }
        int count = str.length() - lastIndex;
        if (count != 1) {
            sb.append(count);
        }
        sb.append(symbol);

        return sb.toString();
    }
}
