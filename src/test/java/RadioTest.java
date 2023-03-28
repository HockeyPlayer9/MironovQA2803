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
    public void MaxStationNumber() {
        Radio radio = new Radio();

        radio.setNumberStation(9);
        radio.next();

        int expected = 0;
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
    public void MinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.minus();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.plus();

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
