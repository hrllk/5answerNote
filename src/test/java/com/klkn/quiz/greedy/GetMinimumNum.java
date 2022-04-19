package com.klkn.quiz.greedy;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GetMinimumNum {


    @Test
    public void demoTest() {
//        int[] A = {1, 3, 6, 4, 1, 2};
//        int result = demo(A);
//        Assert.assertEquals(5, result);

        int[] A = {1, 2, 3};
        int result = demo(A);
        Assert.assertEquals(4, result);

    }

    /***
     * 가장 A에 포함되어있지 않은 가장 작은값의 정수를 리턴 (0보다는 커야함)
     * @param A [1, 3, 6, 4, 1, 2]
     * @return 5
     * @param A [1, 2, 3]
     * @return 4
     *
     */
    public int demo(int [] A){
        int result = 0;

        Arrays.sort(A);
        Set<Integer> set = new HashSet<>();
        for (int num : A){
            set.add(num);
        }
        int loopCnt = 2147483647;
        Iterator<Integer> iterator = set.iterator();
        for (int i = 1; i < loopCnt; i++) {
            if (iterator.hasNext()) {

                if (iterator.next() != i) {
                    result = i;
                    break;
                }
            } else {
                result = i;
                break;
            }

        }

        return result;
    }
}
