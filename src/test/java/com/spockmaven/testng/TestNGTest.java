package com.spockmaven.testng;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.fail;

/**
 * @author berinle
 */
public class TestNGTest {

    @Test
    public void testName() throws Exception {
        fail("this should fail");
    }
}
