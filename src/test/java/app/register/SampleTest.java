package app.register;

import org.testng.annotations.Test;
import org.testng.Assert;

public class SampleTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        Assert.assertEquals(sum, 15, "Addition result is incorrect!");
    }

    @Test
    public void testStringComparison() {
        String actual = "Hello";
        String expected = "Hello";
        Assert.assertEquals(actual, expected, "Strings do not match!");
    }
}
