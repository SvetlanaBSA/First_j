public class Task7 {
    public static void main(String[] args) {
        int number = 48;
        if (number >= 0) {
            if ((number % 100) > 10 && (number % 100) < 20)
                System.out.println(number + " рублей");
            else
                switch (number % 10) {
                    case 0:
                        System.out.println(number + " рублей");
                        break;
                    case 1:
                        System.out.println(number + " рубль");
                        break;
                    case 2:
                        System.out.println(number + " рубля");
                        break;
                    case 3:
                        System.out.println(number + " рубля");
                        break;
                    case 4:
                        System.out.println(number + " рубля");
                        break;
                    case 5:
                        System.out.println(number + " рублей");
                        break;
                    case 6:
                        System.out.println(number + " рублей");
                        break;
                    case 7:
                        System.out.println(number + " рублей");
                        break;
                    case 8:
                        System.out.println(number + " рублей");
                        break;
                    case 9:
                        System.out.println(number + " рублей");
                        break;
            }
        }
        else
            System.out.println("Error. Incorrect number.");
    }
}
