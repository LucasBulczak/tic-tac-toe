package com.alisarrian;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class MyConcatenatorTest {

    @Test
    public void testConcatanate() throws Exception {
        String concatenated = MyConcatenator.concatanate("one", "two", "three", "four");

        assertEquals("one,two,three,four", concatenated);

    }
}