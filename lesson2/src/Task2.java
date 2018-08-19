public class Task2 {
    public static void main(String[] array) {
        //Имеется прямоугольное отверстие размерами a и b (размеры задать любые), определить,
        //можно ли его полностью закрыть круглой картонкой радиусом r (тоже подставляем любое значение).
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
            int diag = (int) Math.sqrt(a * a + b * b);
            //Проверяем можно ли закрыть прямоугольник
            if (radius >= diag / 2)
                System.out.println("Yes. Rectangle is covered with circle.");
            else
                System.out.println("No. Rectangle is covered with circle.");
        }
    }
}
