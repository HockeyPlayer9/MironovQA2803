public class Radio {
    private int NumberStation;
    private int Volume;


    public void plus() {
        if (Volume == 10) {
            Volume++;
        } else {
            Volume = 10;
        }
    }
    public void minus() {
        if (Volume <= 0) ;

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
        if (Volume <= 0) {
            return;
        }

        if (Volume > 10) {
            return;
        }

        this.Volume = Volume;
    }
}