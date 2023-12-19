package com.example.lab2_valuckas;

import org.junit.Test;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;



import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {

    @Test
    public void testCountSymbols() {
        assertEquals(5, TextCounter.countSymbols("Hello"));
    }
    @Test
    public void testCountWords () {
        assertEquals(2, TextCounter.countWords("Hello World"));
        }

    @Test
    public void countWords_shouldReturnZero_whenInputIsNull() {
        int result = TextCounter.countWords(null);
        assertEquals(0, result);
        }
    @Test
    public void countWords_shouldReturnZero_whenInputIsEmpty() {
        int result = TextCounter.countWords("");
        assertEquals(0, result);
    }

    }


