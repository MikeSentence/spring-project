package com.itjun;

import junit.framework.Assert;
import org.junit.Test;

public class DemoTest {
@Test
    public void TestSay(){
        Demo d = new Demo();
        String ret = d.say("jun");
        Assert.assertEquals("hello jun", ret);
    }
}
