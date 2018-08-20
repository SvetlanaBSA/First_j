public class Task5 {
    public static void main(String[] args) {
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
