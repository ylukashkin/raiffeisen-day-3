package com.jpoint.compressor.impl.data;

public class TestData {

    public static final String EXAMPLE_1 = "AAAAA";
    public static final String RESULT_1  = "5A";

    public static final String EXAMPLE_2 = "AAAAABBBC";
    public static final String RESULT_2  = "5A3BC";

    public static final String EXAMPLE_3 = "";
    public static final String RESULT_3  = "";

    public static final String EXAMPLE_4 = null;
    public static final String RESULT_4  = null;

    public static final String EXAMPLE_5 = "ABC";
    public static final String RESULT_5  = "ABC";

    public static final String EXAMPLE_6 = "ABBBBBC";
    public static final String RESULT_6  = "A5BC";

    public static final String EXAMPLE_7 = "A";
    public static final String RESULT_7  = "A";
}
