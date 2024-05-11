package org.example.example2_intToStringVersions;

public class intToStringVersions {

    public static String intToStringV1(int v)  {
        return Integer.toString(v);
    }

    public static String intToStringV2(int v) {
        return "" + v;
    }

    public static String intToStringV3(int v) {
        return String.valueOf(v);
    }

    public static String intToStringV4(int v) {
        return String.format("%d", v);
    }

    public String integerToStringV1(Integer vo) {
        return Integer.toString(vo);
    }
}
