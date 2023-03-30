public class Radio {
    private int NumberStation;
    private int Volume;

    public void next() {
        if (NumberStation != 9) {
            NumberStation++;
        } else {
            NumberStation = 0;
        }
    }

    public void prev() {
        if (NumberStation != 0) {
            NumberStation--;
        } else {
            NumberStation = 9;
        }
    }

    public void plus() {
        if (Volume != 10) {
            Volume++;
        } else {
            Volume = 10;
        }
    }

    public void minus() {
        if (Volume != 0){
            Volume--;
        }

        else {
            Volume = 0;
        }
    }

    public int getNumberStation() {
        return NumberStation;
    }

    public void setNumberStation(int NumberStation) {
        if (NumberStation < 0) {
            return;
        }
        if (NumberStation > 9) {
            return;
        }
        this.NumberStation = NumberStation;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume) {
        if (Volume < 0) {
            return;
        }

        if (Volume > 10) {
            return;
        }

        this.Volume = Volume;
    }
}