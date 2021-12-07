package com.klkn.quiz;


import org.junit.Assert;
import org.junit.Test;


public class QuizNewIdTest {


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
        Assert.assertEquals("bat.y.abcdefghi",solution("...!@BaT#*..y.abcdefghijklm"));
        Assert.assertEquals("z--",solution("z-+.^."));
        Assert.assertEquals("aaa",solution("=.="));
        Assert.assertEquals("123_.def",solution("123_.def"));
        Assert.assertEquals("abcdefghijklmn",solution("abcdefghijklmn.p"));
    }

    public String solution(String new_id) {
        /* 특수문자 */
        new_id = new_id.toLowerCase();

        /* 2. 알파벳, 숫자 밑줄 마침표를 제외한 모든 문자 제거 */
        String[] specialChar = {"~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "{", "]", "}", ":", "?", ",", "<", ">", "/"};
        for (int i = 0; i < specialChar.length; i++) {
            new_id = new_id.replace(specialChar[i], "");
        }
//        new_id = new_id.replaceAll(specialChar,"");
//        for ()

        /* 3. .. > . */
        while (true) {
            if (new_id.contains("..")) {
                new_id = new_id.replace("..", ".");
            } else {
                break;
            }
        }

        /* 4. */
//        String check

        Character firstC = new_id.charAt(0);
        Character endC = new_id.charAt(new_id.length() - 1);
        if (firstC.toString().equals(".")) {
            new_id = new_id.substring(1, new_id.length());
        }
        if (endC.toString().equals(".")) {
            if (new_id.length() >= 2){
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        if (new_id.isEmpty()) {
            new_id = "a";
        }

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            endC = new_id.charAt(new_id.length() - 1);
            if (endC.toString().equals(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        if (new_id.length() <= 2) {
            while (true) {
                new_id += new_id.substring(new_id.length() - 1, new_id.length());
                if (new_id.length() >= 3) {
                    break;
                }
            }

        }
//        new_id = new_id.replace("..",".");


        //        if (new_id.substring(0).equals(".")){
//            new_id.replace(1)
//        }

        System.out.println("new_id : " + new_id);

        System.out.println("hi");

        return new_id;
    }
}
