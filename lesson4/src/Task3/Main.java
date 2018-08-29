package Task3;

public class Main {
    public static void main(String[] args) {
        int sec = 1;
        int min = 2;
        int hours = 3;
        Time time = new Time(sec);
        time.printAllSec(time.getAllSec());
        Time time2 = new Time(sec, min, hours);
        time2.printAllSec(time2.getAllSec());
        time.printDiff(time.diffSec(time2.getAllSec(),time.getAllSec()));
    }
}
