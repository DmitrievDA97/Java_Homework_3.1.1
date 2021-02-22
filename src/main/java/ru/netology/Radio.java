package ru.netology;

public class Radio {
    private int currentStation ;
    private int volumeSound ;
    private int maxStation = 10;
    public Radio() {
    }

    public Radio(int currentStation, int volumeSound, int maxStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
        if (volumeSound > 100) {
            return;
        }
        if (volumeSound < 0) {
            return;
        }
        this.volumeSound = volumeSound;
        this.maxStation = maxStation;
    }

    public int getVolumeSound() {
        return volumeSound;
    }

    public void setVolumeSound(int volumeSound) {
        this.volumeSound = volumeSound;
    }
    public int plusVolume() {
        volumeSound += 1;
        if (volumeSound > 100)
            volumeSound = 100;
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
    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int nextStation () {
        currentStation += 1;
        if (currentStation > maxStation)
            currentStation = 0;
        return currentStation;
    }
    public int prevStation () {
        currentStation -= 1;
        if (currentStation == -1)
            currentStation = maxStation;
        return currentStation;
    }


}
