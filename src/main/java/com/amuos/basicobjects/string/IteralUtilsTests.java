package com.amuos.basicobjects.string;

import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.apache.commons.collections4.IterableUtils;
import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by juan.wang on 5/5/17.
 */
public class IteralUtilsTests {
    @Test
    public void test() {
        Set<String> set = new HashSet<>();
        set.add("ABC_DDKFA");
        set.add("ABC_JJDK");
        Boolean isMatch = IterableUtils.countMatches(set, new ABCPredicate("ABC_")) > 0;
        Assert.assertFalse(isMatch);
    }

    @Test
    public void test1() {
        Set<String> set = new HashSet<>();
        set.add("ABC_DDKFA");
        set.add("ABC_JJDK");
        String prefix = "ABC_";
        Boolean isContained = IterableUtils.contains(set, prefix);
        Assert.assertFalse(isContained);
    }

    @Test
    public void test2() {
        Set<String> set = new HashSet<>();
        set.add("ABC_DDKFA");
        set.add("ABC_JJDK");
        boolean setContained = set.contains("ABC_");
        Assert.assertFalse(setContained);
        Boolean isContained = IterableUtils.contains(set, new ABCPredicate("ABC_"));
        Assert.assertFalse(isContained);
    }

    class ABCPredicate implements Predicate<String> {
        private String abc;
        public ABCPredicate(String abc) {
            this.abc = abc;
        }

        public boolean evaluate(String object) {
            return false;
        }
    }
}
