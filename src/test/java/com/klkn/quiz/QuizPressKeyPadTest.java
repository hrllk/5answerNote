package com.klkn.quiz;


import org.junit.Assert;
import org.junit.Test;


public class QuizPressKeyPadTest {


    /*
     * ,
     *
     * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
     * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
     * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
     * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
     * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
     * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     * 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
     * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다
     * */
    @Test
    public void newId(){

//        Assert.assertEquals("baby","baby");
//        Assert.assertEquals("bat.y.abcdefghi",solution("...!@BaT#*..y.abcdefghijklm"));
//        Assert.assertEquals("z--",solution("z-+.^."));
//        Assert.assertEquals("aaa",solution("=.="));
//        Assert.assertEquals("123_.def",solution("123_.def"));
//        Assert.assertEquals("abcdefghijklmn",solution("abcdefghijklmn.p"));
    }






    /*
    * [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
    * [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
    * [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"
    * */
    public String solution(int numbers[], String hand) {

        String[][] keypad = new String[4][3];
        keypad[3][0] = "L";
        keypad[3][2] = "R";
        /*
        * [1] [2] [3]  * 00 01 02
        * [4] [5] [6]  * 10 11 12
        * [7] [8] [9]  * 20 21 22
        * [*] [0] [#]  * 30 31 32
        * */

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {

            switch (number){
                case 1 : keypad = new String[4][3]; keypad[0][0] = "L"; sb.append("L"); break;
                case 4 : keypad = new String[4][3]; keypad[1][0] = "L"; sb.append("L"); break;
                case 7 : keypad = new String[4][3]; keypad[2][0] = "L"; sb.append("L"); break;

                case 3 : keypad = new String[4][3]; keypad[0][2] = "R"; sb.append("R"); break;
                case 6 : keypad = new String[4][3]; keypad[1][2] = "R"; sb.append("R"); break;
                case 9 : keypad = new String[4][3]; keypad[2][2] = "R"; sb.append("R"); break;

                case 0 : 
                case 2 :
                case 5 :
                case 8 :
                    // 1. 손가락의 거리가 가까운손이 입력을 한다. (패드당 거리를 1로 계산)
                    // 2. 왼쪽손의거리, 오른쪽손의 거리가 같다면, 주손이 패드를 누른다.

            }
            
        }




        return null;
        
    }
    public String findFinger(String[][] fingerlocation){

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }
    };
}
