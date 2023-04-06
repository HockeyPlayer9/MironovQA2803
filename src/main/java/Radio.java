public class Radio {
    private int numberStation;
    private int volume;
    private int maxStation;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int countStations) {
        maxStation = countStations - 1;
    }

    public void next() {
        if (numberStation != maxStation) {
            numberStation++;
        } else {
            numberStation = 0;
        }
    }

    public void prev() {
        if (numberStation != 0) {
            numberStation--;
        } else {
            numberStation = maxStation;
        }
    }

    public void plus() {
        if (volume != 100) {
            volume++;
        } else {
            volume = 100;
        }
    }

    public void minus() {
        if (volume != 0) {
            volume--;
        } else {
            volume = 0;
        }
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > maxStation) {
            return;
        }
        this.numberStation = numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }

        if (volume > 100) {
            return;
        }

        this.volume = volume;
    }
}