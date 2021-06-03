/*
 *  UCF COP3330 Summer 2021 Exercise 4 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_is_generated_in_expected_format() {
        App myApp = new App();

        String testNoun = "dog";
        String testVerb = "walk";
        String testAdjective = "blue";
        String testAdverb = "quickly";

        String expectedOutput = "Do you walk your blue dog quickly? That's hilarious!";
        String actualOutput = myApp.generateOutputString(testVerb, testAdjective, testNoun, testAdverb);

        assertEquals(expectedOutput, actualOutput);
    }
}