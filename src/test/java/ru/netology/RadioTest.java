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
    void zeroStation() {
        Radio radio = new Radio();
        int currentStation = 3;
        radio.setCurrentStation(currentStation);
        radio.zeroStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void firstStation() {
        Radio radio = new Radio();
        int currentStation = 7;
        radio.setCurrentStation(currentStation);
        radio.firstStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void secondStation() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.secondStation();
        int expected = 2;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void thirdStation() {
        Radio radio = new Radio();
        int currentStation = 8;
        radio.setCurrentStation(currentStation);
        radio.thirdStation();
        int expected = 3;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void fourthStation() {
        Radio radio = new Radio();
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.fourthStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void fifthStation() {
        Radio radio = new Radio();
        int currentStation = 3;
        radio.setCurrentStation(currentStation);
        radio.fifthStation();
        int expected = 5;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void sixthStation() {
        Radio radio = new Radio();
        int currentStation = 3;
        radio.setCurrentStation(currentStation);
        radio.sixthStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void seventhStation() {
        Radio radio = new Radio();
        int currentStation = 1;
        radio.setCurrentStation(currentStation);
        radio.seventhStation();
        int expected = 7;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void eighthStation() {
        Radio radio = new Radio();
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.eighthStation();
        int expected = 8;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void ninthStation() {
        Radio radio = new Radio();
        int currentStation = 6;
        radio.setCurrentStation(currentStation);
        radio.ninthStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }


}