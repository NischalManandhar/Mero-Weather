package com.meroweather.meroweather.data;


import android.test.AndroidTestCase;

public class TestPractice extends AndroidTestCase {
    /*
        Many java classes can be created for testing purpose
        method setUp() run before the test
        methods with prefix test runs with the test processor
        method tearDown() run after each test
     */
    @Override
    protected void setUp() throws Exception {
        //This runs before the test
        super.setUp();
    }

    public void testThatDemonstratesAssertions() throws Throwable {
        //1. this(method with prefix test) automatically runs with the testprocessor
        //2. Each test should have atleast one check to see if the program applies the correct output.
        //   An assert is just that,its a declaration that the outcome after part of a test is run matches
        //   expectations.If the assert doesn't match, the test will fail.
        int a = 5;
        int b = 3;
        int c = 5;
        int d = 10;

        assertEquals("X should be equal", a, c);
        assertTrue("Y should be true", d > a);
        assertFalse("Z should be false", a == b);

        if (b > d) {
            fail("XX should never happen");
        }
    }

    @Override
    protected void tearDown() throws Exception {
        //This runs after each test

        super.tearDown();
    }
}
