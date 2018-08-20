public class Task1 {
    public static void main(String[] args) {
        //Зададим число с помощью random в промежутке от 0 до 100
        int x = (int) (Math.random()*100+1);
        //Выведем на экран сгенерированное число
        System.out.println("Random = " + x);
        //Определим последнюю цифру числа
        int lastDigit = x % 10;
        //Выведем ответ, является ли последнее число семеркой
        if (lastDigit==7)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
