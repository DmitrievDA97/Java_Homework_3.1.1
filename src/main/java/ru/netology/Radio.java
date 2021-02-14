package ru.netology;

public class Radio {
    private int currentStation;
    private int volumeSound;


    public int getVolumeSound() {
        return volumeSound;
    }

    public void setVolumeSound(int volumeSound) {
        if (volumeSound > 10) {
            return;
        }
        if (volumeSound < 0) {
            return;
        }
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
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
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


}
