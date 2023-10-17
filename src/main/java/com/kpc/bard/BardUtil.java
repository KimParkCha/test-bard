package com.kpc.bard;

import com.pkslow.ai.AIClient;
import com.pkslow.ai.GoogleBardClient;
import com.pkslow.ai.domain.Answer;

public class BardUtil {
    private final String token = new String("");
    private final AIClient client = new GoogleBardClient(token);

    private static BardUtil bardUtil = new BardUtil();
    private BardUtil() {

    }
    public static BardUtil getInstance(){
        return bardUtil;
    }

    public Answer ask(String ask){
        return client.ask(ask);
    }
}
