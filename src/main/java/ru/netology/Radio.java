package ru.netology;

public class Radio {
    private int currentStation;
    private int volumeSound;


    public int getVolumeSound() {
        return volumeSound;
    }

    public void setVolumeSound(int volumeSound) {
        this.volumeSound = volumeSound;
    }
    public int plusVolume() {
        volumeSound += 1;
        if (volumeSound > 10)
            volumeSound = 10;
        return volumeSound;
    }
    public int minusVolume () {
        volumeSound -= 1;
        if (volumeSound < 0)
            volumeSound = 0;
        return volumeSound;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int nextStation () {
        currentStation += 1;
        if (currentStation == 10)
            currentStation = 0;
        return currentStation;
    }
    public int prevStation () {
        currentStation -= 1;
        if (currentStation == -1)
            currentStation = 9;
        return currentStation;
    }
    public int zeroStation () {
        currentStation = 0;
        return currentStation;
    }

    public int firstStation () {
        currentStation = 1;
        return currentStation;
    }
    public int secondStation () {
        currentStation = 2;
        return currentStation;
    }
    public int thirdStation () {
        currentStation = 3;
        return currentStation;
    }
    public int fourthStation () {
        currentStation = 4;
        return currentStation;
    }
    public int fifthStation () {
        currentStation = 5;
        return currentStation;
    }
    public int sixthStation () {
        currentStation = 6;
        return currentStation;
    }
    public int seventhStation () {
        currentStation = 7;
        return currentStation;
    }
    public int eighthStation () {
        currentStation = 8;
        return currentStation;
    }
    public int ninthStation () {
        currentStation = 9;
        return currentStation;
    }
    
}
