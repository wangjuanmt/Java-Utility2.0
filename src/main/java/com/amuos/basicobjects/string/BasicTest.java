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
}
