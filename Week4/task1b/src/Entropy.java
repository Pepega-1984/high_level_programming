package org.example;

public class Entropy {
    public double calculateShannon(String input) {
        if (input == null || input.equals("")) {
            return 0.0;
        }

        int[] freq = new int[256];
        int length = input.length();

        for (int i = 0; i < length; i++) {
            freq[input.charAt(i)]++;
        }

        double shannonEntropy = 0.0;

        for (int i  = 0; i < 256; i++) {
            if (freq[i] > 0) {
                double freqI = (double) freq[i] / length;
                shannonEntropy -= freqI * (Math.log(freqI) / Math.log(2));
            }
        }
        return shannonEntropy;
    }
}
