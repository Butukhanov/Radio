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
        cond.setCurrentStation(9);
        cond.setNextStation();
        int actual = cond.getNextStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        cond.setPrevStation();
        int actual = cond.getPrevStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(50);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void plusVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);
        cond.setPlusVolume();
        int actual = cond.getPlusVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        cond.setMinusVolume();
        int actual = cond.getMinusVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }
}

