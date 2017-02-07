package com.amuos.testrail;

import com.nullin.testrail.TestRailListener;
import com.nullin.testrail.annotations.TestRailCase;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by juan.wang on 2/5/17.
 * Execute command mvn test-Dtest=TestRailIntegration#Test1 -DtestRail.enabled=true
 * -DtestRail.url={} -DtestRail.username={} -DtestRail.password={} -DtestRail.testPlanId={}
 * testRail.password can NOT be special characters, like "#". May cause authorization error.
 */
@Listeners(TestRailListener.class)
public class TestRailIntegration {
    @TestRailCase("RS001")
    @Test
    public void Test1() throws Exception {
        Assert.assertTrue(true);
    }
}
