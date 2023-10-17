package com.kpc.bard;

import com.pkslow.ai.domain.Answer;

public class BardTest {
    public static void main(String[] args) {
        Answer answer = BardUtil.getInstance().ask("바드야 안녕?");
        System.out.println(answer.getChosenAnswer());
    }
}
