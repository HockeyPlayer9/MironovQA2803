import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void StationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(4);

        int expected = 4;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NeverStationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VeryMaxStationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(11);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxStationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(4);
        radio.next();

        int expected = 5;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinStationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(6);
        radio.prev();

        int expected = 5;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.minus();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinusMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(3);
        radio.minus();

        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.plus();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverVolume() {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.plus();

        int expected = 8;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(105);
        radio.plus();

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CountStation() {
        Radio radio = new Radio(10);

        radio.setNumberStation(9);

        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CountMaxStation() {
        Radio radio = new Radio(10);

        radio.setNumberStation(11);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }
}

