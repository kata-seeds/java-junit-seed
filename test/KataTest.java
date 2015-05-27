package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import kata.Kata;

public class KataTest {
    @Test
    public void greetingTest() {
        assertThat(Kata.greeting("friend"), is("Hello friend!"));
    }
}
