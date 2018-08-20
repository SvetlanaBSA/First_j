public class Task5 {
    public static void main(String[] args) {
        /*Создайте переменную типа String c любым текстом (не сильно короткое).
        Далее выведите на экран количество символов в данной строке.
        Далее разделите строку пополам, в результате у вас должно быть 2-е новых переменных типа String с частями из изначальной строки.
        Полученные строки выведите на экран.*/
        String text = "qwaszxx";
        //System.out.println("Количество символов в данной строке = " + text.length());
        if (text.length() == 0)
            System.out.println("No one character were entered.");
        else {
            if (text.length() == 1)
                System.out.println("Only one character was entered - " + text);
            else
                if ((text.length() % 2) == 0) {
                    System.out.println("First part = " + text.substring(0, text.length() / 2));
                    System.out.println("Second part = " + text.substring(text.length() / 2, text.length()));
                } else {
                    System.out.println("First part (on 1 character less than second part) = " + text.substring(0, text.length() / 2));
                    System.out.println("Second part = " + text.substring(text.length() / 2, text.length()));
                }
        }
    }
}
