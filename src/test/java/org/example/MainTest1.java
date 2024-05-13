package org.example;

import junit.framework.TestCase;

public class MainTest1 extends TestCase {

    public void testAdded() {
        Main main = new Main();
        assertEquals(10, main.added(4,6));
    }
}