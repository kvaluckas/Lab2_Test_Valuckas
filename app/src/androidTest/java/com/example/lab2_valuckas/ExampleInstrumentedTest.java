package com.example.lab2_valuckas;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.lab2_valuckas", appContext.getPackageName());
    }
    @Test
    public void countSymbols_shouldReturnCorrectCount_whenInputIsNotEmpty() {
        int result = TextCounter.countSymbols("Hello, World!");
        assertEquals(13, result);
    }
    @Test
    public void countWords_shouldReturnZero_whenInputIsNull() {
        int result = TextCounter.countWords(null);
        assertEquals(0, result);
    }
    @Test
    public void countWords_shouldReturnCorrectCount_whenInputIsNotEmpty() {
        int result = TextCounter.countWords("This is a sample sentence.");
        assertEquals(5, result);
    }
}