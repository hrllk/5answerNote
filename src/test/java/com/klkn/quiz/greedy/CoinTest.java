package com.klkn.quiz.greedy;

import org.junit.Test;

public class CoinTest {



    public static void main(String[] args) {

    }
    @Test
    public void changesTest() {
//        int totalPayment = 4200;
        int totalPayment = 4790;
        int[] changesList = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int minCnt = getMinChanges(totalPayment, changesList);
        System.out.println(minCnt);

    }

    public int getMinChanges(int tp, int[] changesList){

        int totalChangesCnt = 0;
        for (int i = changesList.length - 1; i >= 0; i--){

            int changes = changesList[i];
            int changesCnt = tp / changes;
            if (changesCnt != 0){

                int change = tp % changes;
                totalChangesCnt += changesCnt;
                tp = change;
            }
        }

//        System.out.println("totalChangesCnt : " +totalChangesCnt);

        return totalChangesCnt;
    }


    @Test
    public void test(){


        System.out.println("4200 / 500 = " + 4200 / 500);
        System.out.println("4200 % 500 = " + 4200 % 500);
    }


}
