package com.test.java.company;

import com.company.computer;
import org.junit.Test;
import static org.junit.Assert.*;

public class computerTest{
    computer actual = new computer();

    @Test
    public void testComputer() {
        actual.getUserInput();
        assertTrue(actual.getSelects().equals("rock") || actual.getSelects().equals("paper") || actual.getSelects().equals("scissors")); // Ref: https://stackoverflow.com/questions/6028750/how-to-assert-an-actual-value-against-2-or-more-expected-values?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
    }
}