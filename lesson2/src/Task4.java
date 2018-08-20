public class Task4 {
    public static void main(String[] args) {
        int day = 29; //(int) (Math.random()*30+1);
        int month = 2; //(int) (Math.random()*12+1);
        int year = 2000; //(int) (Math.random()*2018+1);
        System.out.println("day.month.year = " + day + "." + month + "." + year);
        //В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
        //System.out.println("year % 4 = " + year % 4); //Для проверки. Если = 0, то год высокосный
        //Проверим, что все введенные значения допустимые
        if ((0 < day && day < 32) && (0 < month && month < 13) && (0 < year)) {
            //Проверим какой день, нужно ли будет увеличивать месяц
            //Проверяем какой месяц, нужно ли увеличивать год
            //Для 02 месяца учитываем высокосный ли год
            if (day < 28)
                System.out.println((day + 1) + "." + month + "." + year);
            else {
                switch (day) {
                    case 28:
                        if (month == 2) {
                            if (year % 4 == 0)
                                System.out.println("29.2." + year);
                            else
                                System.out.println("1.3." + year);
                        } else
                            System.out.println("30." + month + "." + year);
                        break;
                    case 29:
                        if (month == 2)
                            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                                System.out.println("1.3." + year);
                            else
                                System.out.println("Error. Incorrect data."+ " " + month + " month hasn't 29 date at " + year + " year.");
                        else
                            System.out.println("30." + month + "." + year);
                        break;
                    case 30:
                        if (month == 4 || month == 6 || month == 9 || month == 11)
                            System.out.println("1." + ++month + "." + year);
                        else
                            if (month == 2)
                                System.out.println("Error. Incorrect data." + " " + month + " month hasn't 30 date.");
                            else
                                System.out.println("31." + month + "." + year);
                        break;
                    case 31:
                        if (month == 12)
                            System.out.println("01.01." + ++year);
                        else
                            if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)
                                System.out.println("Error. Incorrect data." + " " + month + " month hasn't 31 date.");
                            else
                                System.out.println("01." + ++month + "." + year);
                        break;
                }
            }
        }
        else
            System.out.println("Error. Enter correct data.");
    }
}
