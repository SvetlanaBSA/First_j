public class SearchInMassive {
    public static void main (String[] args) {
         //создание и инициализация массива
        int[] numberArray = new int[10];
        for(int i = 0; i < 10; i++){
            numberArray[i] = (int) (Math.random()*100 + 1);
        }
        //вывод значений на консоль
        System.out.print("[");
        for(int i = 0; i < 9; i++) {
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println(numberArray[9] + "]");
        //поиск наименьшего значения в массиве
        int min = numberArray[0];
        int minIndex = 0;
        for(int i = 1; i < 10; i++){
            if (min > numberArray[i]) {
                min = numberArray[i];
                minIndex = i;
            }
        }
        //поиск наибольшего занчения в массиве
        int max = numberArray[0];
        int maxIndex = 0;
        for(int i = 1; i < 10; i++){
            if (max < numberArray[i]) {
                max = numberArray[i];
                maxIndex = i;
            }
        }
        System.out.println("Min value = " + min + ". Max value =" + max);
        //замена максимального и минимального значений и вывод на экран
        numberArray[minIndex] = 0;
        numberArray[maxIndex] = 99;
        System.out.print("[");
        for(int i = 0; i < 9; i++) {
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println(numberArray[9] + "]");
    }
}