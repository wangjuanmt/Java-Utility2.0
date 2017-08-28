package com.amuos.basicobjects.toCatagary;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by juan.wang on 5/19/17.
 */
public class test {
    @Test
    public void testUrlEncode() {
        String string = "dfjaldfs";
        encode(string);
        System.out.println(string);
    }

    /**
     * NPE
     */
    @Test
    public void testUrlEncode2() {
        String string = null;
        encode(string);
        System.out.println(string);
    }

    public static String encode(String string) {
        try {
            return URLEncoder.encode(string, "UTF-8");
        } catch (UnsupportedEncodingException var2) {
            throw new RuntimeException(var2);
        }
    }
}
