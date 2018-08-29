package Task3;

class Time {
    private int sec;
    private int min = 0;
    private int hours = 0;

    //конструктор
    Time(int sec){
        this.sec = sec;
    }
    Time(int sec, int min, int hours){
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }
    //Методы
    //вычисление всех секунд
    int getAllSec() {
        if (this.hours > 0) {
            return (this.sec + this.min * 60 + this.hours * 360);
        }
        else {
            return (this.sec);
        }
    }
    //сравнение двух объектов
    int diffSec(int sec1, int sec2) {
        return (sec1-sec2);
    }

    //вывод всех секунд на экран
    void printAllSec(int allSec){
        System.out.println("Всего секунд = " + allSec);
    }
    //вывод разности секунд у двух объектов
    void printDiff(int diff){
        System.out.println("Разность в секундах = " + diff);
    }
}
