package ru.netology.statistic;

public class Radio {
    public int currentStation;
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int nextStation;
    public void setNextStation(int nextStation){
        if (currentStation<9){
            currentStation = currentStation +1;

        }
        this.nextStation = nextStation;
    }
    public int getNextStation(){
        return nextStation;
    }


}

