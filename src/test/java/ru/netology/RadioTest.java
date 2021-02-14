package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void plusVolumeMax() {
        Radio radio = new Radio();
        int volumeSound = 10;
        radio.setVolumeSound(volumeSound);
        radio.plusVolume();
        int expected = 10;
        assertEquals(expected, radio.getVolumeSound());
    }
    @Test
    void plusVolume() {
        Radio radio = new Radio();
        int volumeSound = 8;
        radio.setVolumeSound(volumeSound);
        radio.plusVolume();
        int expected = 9;
        assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void minusVolumeMin() {
        Radio radio = new Radio();
        int volumeSound = 0;
        radio.setVolumeSound(volumeSound);
        radio.minusVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolumeSound());
    }
    @Test
    void minusVolume() {
        Radio radio = new Radio();
        int volumeSound = 4;
        radio.setVolumeSound(volumeSound);
        radio.minusVolume();
        int expected = 3;
        assertEquals(expected, radio.getVolumeSound());
    }

    @Test
    void nextStationFromMaxToMin() {
        Radio radio = new Radio();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void nextStation() {
        Radio radio = new Radio();
        int currentStation = 7;
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        int currentStation = 5;
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void prevStationFromMinToMax() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void setVolumeSoundHigherLimit() {
        Radio radio = new Radio();
        int volumeSound = 11;
        int expected = 0;
        radio.setVolumeSound(volumeSound);
        assertEquals(expected, radio.getVolumeSound());

    }
    @Test
    public void setVolumeSoundLowerLimit() {
        Radio radio = new Radio();
        int volumeSound = -1;
        int expected = 0;
        radio.setVolumeSound(volumeSound);
        assertEquals(expected, radio.getVolumeSound());

    }
    @Test
    public void setCurrentStationLowerLimit() {
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());

    }
    @Test
    public void setCurrentStationHigherLimit() {
        Radio radio = new Radio();
        int currentStation = 10;
        int expected = 0;
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());

    }


}