package com.example.gbfss;

class Arithmetic {

    static int calculateSpark(int crystals, int singleTickets, int tenTickets, int sparks){
        int result = 0;

        result += crystals/300;
        result += singleTickets;
        result += tenTickets * 10;
        result += sparks;

        return result;
    }
}
