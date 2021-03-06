public class Task2 {
    public static void main(String[] array) {
        //Зададим длину и шиирину с помощью random в промежутке от 0 до 10
        int a = 4; //(int) (Math.random()*10+1);
        int b = 3; //(int) (Math.random()*10+1);
        //Выведем на экран сгенерированное число
        System.out.println("a and b = " + a + ", " + b);
        //Зададим радиус окружности radius
        int radius = (int) (Math.random()*10+1);
        //Выведем на экран сгенерированное число
        System.out.println("Radius = " + radius);
        //Проверка на корректность введенных данных
        if (a <= 0 || b <= 0 || radius <=0)
            System.out.println("Error: incorrect data");
        else {
            //Вычислим диагональ прямоугольника
            int diag = (int) Math.sqrt(a * a + b * b); //5
            //Проверяем можно ли закрыть прямоугольник
            if (radius >= (diag / 2))
                System.out.println("Yes. Rectangle is covered with circle.");
            else
                System.out.println("No. Rectangle is covered with circle.");
        }
    }
}
