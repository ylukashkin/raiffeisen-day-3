package com.jpoint.compressor.impl.v1;

import com.jpoint.compressor.StringCompressor;
import com.jpoint.compressor.impl.data.TestData;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompressorV1Test {
    private StringCompressor testSubject;

    @Before
    public void init() {
        testSubject = new StringCompressorV1();
    }

    @Test
    public void testBasicResultsForExtractToStrings() {
        // when
        String result1 = testSubject.compress(TestData.EXAMPLE_1);
        String result2 = testSubject.compress(TestData.EXAMPLE_2);
        String result3 = testSubject.compress(TestData.EXAMPLE_3);
        String result4 = testSubject.compress(TestData.EXAMPLE_4);
        String result5 = testSubject.compress(TestData.EXAMPLE_5);
        String result6 = testSubject.compress(TestData.EXAMPLE_6);
        String result7 = testSubject.compress(TestData.EXAMPLE_7);

        // then
        assertThat(result1, is(TestData.RESULT_1));
        assertThat(result2, is(TestData.RESULT_2));
        assertThat(result3, is(TestData.RESULT_3));
        assertThat(result4, is(TestData.RESULT_4));
        assertThat(result5, is(TestData.RESULT_5));
        assertThat(result6, is(TestData.RESULT_6));
        assertThat(result7, is(TestData.RESULT_7));
    }

    @Test
    public void simplePerformance() {
        for (int i = 0; i < 10; i ++) {
            long currentTimeMillis = System.currentTimeMillis();
            for (int j = 0; j < 10000000; j ++) {
                String result1 = testSubject.compress(TestData.EXAMPLE_1);
                String result2 = testSubject.compress(TestData.EXAMPLE_2);
                String result3 = testSubject.compress(TestData.EXAMPLE_3);
                String result4 = testSubject.compress(TestData.EXAMPLE_4);
                String result5 = testSubject.compress(TestData.EXAMPLE_5);
                String result6 = testSubject.compress(TestData.EXAMPLE_6);
                String result7 = testSubject.compress(TestData.EXAMPLE_7);
            }
            System.out.println(System.currentTimeMillis() - currentTimeMillis);
        }
    }
}
