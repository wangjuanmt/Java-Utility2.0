package com.amuos.json;

import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

/**
 * Created by juan.wang on 4/24/17.
 */
public class JsonTest {
    @Test
    public void nullTest() {
        String response = null;
        try {
            new JSONObject(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
