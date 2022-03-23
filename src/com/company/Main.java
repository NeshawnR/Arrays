package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int[][] water = new int[10][20];

    Random rd = new Random(40);
    for (int i = 0; i < 10; i++){

            for (int j = 0; j < 20; j++){
                water[i][j] = rd.nextInt() - 20;

                System.out.println(water[i][j]);
            }
        }
    }
}
