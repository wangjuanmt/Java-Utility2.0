package com.amuos.basicobjects.string;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by juan.wang on 11/1/17.
 */
public class PatternString {
    /**
     * not work
     */
    @Test
    public void testXMLInvalidCharacters() {
        String xml10pattern = "[^"
                + "\u0009\r\n"
                + "\u0020-\uD7FF"
                + "\uE000-\uFFFD"
                + "\ud800\udc00-\udbff\udfff"
                + "]";
        String illegal = "Hello, World!\0&shlslofepre";
        String legal = illegal.replaceAll(xml10pattern, "");
        System.out.println(legal);
    }

    @Test
    public void testXMLInvalidCharacters2() {
        String illegal = "Wewrewr$";
        String illegalPattern = "[&><\"']";
        Pattern pattern = Pattern.compile(illegalPattern);
        Matcher matcher = pattern.matcher(illegal);
        Boolean isMatched = matcher.find();
        System.out.println(isMatched);
    }

    /**
     * not work
     */
    @Test
    public void testXMLInvalidCharacters3() {
        String illegal = "&asfdjoopr23";
        String xmlInvalidCharactersPattern = "[^"
                + "\u0009\r\n" // #x9 | #xA | #xD
                + "\u0020-\uD7FF" // [#x20-#xD7FF]
                + "\uE000-\uFFFD" // [#xE000-#xFFFD]
                + "\ud800\udc00-\udbff\udfff" // [#x10000-#x10FFFF]
                + "]";
        Pattern pattern = Pattern.compile(xmlInvalidCharactersPattern, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(illegal);
        Boolean isMatched = matcher.find();
        System.out.println(isMatched);
    }

}
