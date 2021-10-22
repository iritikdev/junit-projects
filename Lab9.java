/*
  Muhammad Zain
  10/19/2021
  CMSC 255-901 LAB 09
*/

import java.util.Arrays;

public class Lab9 {

    public static void main(String[] args) {
        int [][] addTo10Input = {
                {  6,  3,  2,  0,  4},
                { 34, 53,  0, 23,  1},
                {  0, 23, 54, 11,  7}
        };

        double [][] findAvgInput = {
                {  5, 4.5,  6.8},
                {  6,  0,  3.4},
                { 7,  8.4,  2.3}
        };

        double [][] findAvgInputLarge = {
                { 6.7,  23.8,  0,  5.9,  12.8,  45.7},
                {  0,  36.8,  13.5,  6.7,  54.9,  67.4},
                {  37.4,  2.5,  39.8,  0,  2.4,  43.6},
                {  44.6,  76.5,  4.5, 2.4,  0, 54.6},
                {  5.4,  76.3,  6.5, 28.5,  54.7,  0},
                {  19.4,  0,  5.3,  65.4,  93.5,  3.5}
        };

        addTo10 (addTo10Input);
        System.out.println();
        findAverage (findAvgInput);
        System.out.println();
        findAverage (findAvgInputLarge);
        }

    public static void addTo10 (int [][] array) {
        int iZeroPlace = 0, jZeroPlace = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                if (array[i][j] == 0) {
                    iZeroPlace = i;
                    jZeroPlace = j;
                }
            }
            if (sum != 10) {
                int haveToMinus = 10 - sum;
                array[iZeroPlace][jZeroPlace] = haveToMinus;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void findAverage (double [][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    double sum1 = 0;
                    double sum2 = 0;
                    for (int k = 0; k < array[i].length; k++) {
                        sum1 = sum1 + array[i][k];
                    }
                    for (int k = 0; k < array.length; k++) {
                        sum2  = sum2 + array[k][j];
                    }
                    double avg1 = (sum1 / array[i].length);
                    double avg2 = (sum2 / array.length);

                    double max = Math.max(avg1, avg2);
                    array[i][j] = max;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
    // findAverage() ends...
}