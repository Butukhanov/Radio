package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void currentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(50);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio cond = new Radio();
        cond.setNextStation(2);
        int actual = cond.getNextStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

}

