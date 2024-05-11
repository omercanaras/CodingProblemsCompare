package org.example.example2_intToStringVersions;


import org.openjdk.jmh.annotations.Benchmark;

public class Main {


    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
        String v1= intToStringVersions.intToStringV1(5);
        String v2= intToStringVersions.intToStringV2(5);
        String v3= intToStringVersions.intToStringV3(5);
        String v4= intToStringVersions.intToStringV4(5);

    }

    @Benchmark
    public void init() {
        // Do nothing
    }

}