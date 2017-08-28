package com.amuos.basicobjects.string;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.apache.commons.collections4.IterableUtils;
import org.testng.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by juan.wang on 5/5/17.
 */
public class CollectionTests {
    private Set<String> error = Collections.<String> emptySet();

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

    @Test
    public void test3() {
        String error = getError();
        Set<String> errorSet = getErrorSet();
        System.out.println(error + " : " + errorSet.toString());
    }

    public String getError() {
        return StringUtils.join(error, ",");
    }

    public void setError(String error) {
        this.error = new HashSet<String>(
                Arrays.asList(StringUtils.split(error, ',')));
    }

    public Set<String> getErrorSet() {
        return error;
    }

    public void setErrorSet(Set<String> errorSet) {
        this.error = errorSet;
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
