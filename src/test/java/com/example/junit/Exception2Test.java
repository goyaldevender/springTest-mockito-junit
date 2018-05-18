package com.example.junit;

import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

// This is a bit old school, widely used in JUnit 3. Test the exception type and also the exception detail. Refer below :
public class Exception2Test {

    @Test
    public void testDivisionWithException() {
        try {
            int i = 1 / 0;
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("/ by zero"));
			//assert others
        }
    }

    @Test
    public void testEmptyList() {
        try {
            new ArrayList<>().get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }


}