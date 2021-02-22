package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void plusVolumeMax() {
        Radio radio = new Radio(1,100,10);
        radio.plusVolume();
        int expected = 100;
        assertEquals(expected, radio.getVolumeSound());
    }
    @Test
    void plusVolume() {
        Radio radio = new Radio(1,10,10);
        radio.plusVolume();
        int expected = 11;
        assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void minusVolumeMin() {
        Radio radio = new Radio(1,0,10);
        radio.minusVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolumeSound());
    }
    @Test
    void minusVolume() {
        Radio radio = new Radio(1,100,10);
        radio.minusVolume();
        int expected = 99;
        assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void nextStationFromMaxToMin() {
        Radio radio = new Radio(10,100,10);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void nextStation() {
        Radio radio = new Radio(1,100,10);
        radio.nextStation();
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio(1,100,10);
        radio.prevStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void prevStationFromMinToMax() {
        Radio radio = new Radio(0,100,10);
        radio.prevStation();
        int expected = radio.getMaxStation();
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void setVolumeSoundHigherLimit() {
        Radio radio = new Radio(1,101,10);
        int expected = 0;
        assertEquals(expected, radio.getVolumeSound());

    }
    @Test
    public void setVolumeSoundLowerLimit() {
        Radio radio = new Radio(1,-1,10);
        int expected = 0;
        assertEquals(expected, radio.getVolumeSound());

    }
    @Test
    public void setCurrentStationLowerLimit() {
        Radio radio = new Radio(-1,100,10);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }
    @Test
    public void setCurrentStationHigherLimit() {
        Radio radio = new Radio(11,100,10);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }


}