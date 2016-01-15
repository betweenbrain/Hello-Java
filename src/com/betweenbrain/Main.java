package com.betweenbrain;

public class Main {

    public static void main(String[] args) {

        // Int has width of 32 in memory, underscores for readability
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        int myTotal = (minInt / 2);
        System.out.println(myTotal);

        // Byte has width of 8 in memory, fastest
        byte minByte = -128;
        byte maxByte = 127;
        byte newByte = (byte) (minInt / 2); // must cast as byte
        System.out.println(newByte);

        // Short has width of 16 in memory
        short minShort = -32_768;
        short maxShort = 32_767;

        // Long has width of 64, note "L" at end
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;
    }
}
