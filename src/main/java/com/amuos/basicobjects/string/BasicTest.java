package com.amuos.basicobjects.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juan.wang on 3/2/17.
 */
public class BasicTest {
    @Test
    public void listSizeTest() {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(" ");
        System.out.println(list.size());
    }

    @Test
    public void replaceStringTest() {
        String str1 = "More Info (if any):\n"
                + "- testName : `asdfaksf\n`";
        String str2 = str1.replace("\n", "\\\\n");
        System.out.println(str2);
    }

    /**
     * "abc+null"
     */
    @Test
    public void plusNullTest() {
        String a = "abc+";
        String b = a + null;
        System.out.println(b);
    }

    @Test
    public void testSplit() {
        String toSplit = "abc";
        String[] splitArray = toSplit.split(",");
        System.out.println(splitArray.length);
    }

    @Test
    public void testJoin() {
        String ret = "";
        String toJoin = "";
        ret = toJoin.join(",");
        System.out.println();
        toJoin = "abc";
        System.out.println(toJoin.join(","));

    }

    @Test
    public void testReplace() {
        String original = "url=${BROWSER_URL}&w";
        String newUrl = original.replace("${BROWSER_URL}", "");
        System.out.println(newUrl);
    }
}
