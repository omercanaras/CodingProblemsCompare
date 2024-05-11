package org.example.example2_intToStringVersions;

import org.openjdk.jmh.annotations.Benchmark;

public class BenchmarkRunner {
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);


    }
    @Benchmark
    public void init() {
        // Do nothing
    }
}

