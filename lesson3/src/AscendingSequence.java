import java.util.Scanner;

public class AscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();
        //преобразуем число в строку и найдем ее длину для определия кол-ва символов массива
        //String numberDuplicate = Integer.toString(number);
        //int numberLength = numberDuplicate.length();
        int length = String.valueOf(number).length();
        //инициализация массива
        int[] numberArray = new int[length];
        int numberRemains = number;
        for(int i = length - 1; i >=0; i--){ //for (int i = 0; i<0; i++)
            numberArray[i] = numberRemains % 10; //numberArray[length - 1] = numberRemains % 10
            numberRemains /= 10;
        }
        //является ли возрастающей последовательностью
        for(int i = 1; i < length; i++){
            if (numberArray[i-1] != numberArray[i] - 1){
                System.out.println("Цифры " + number + " числа НЕ образуют возрастающую последовательность.");
                break;
            }
            else
                if (i == length - 1)
                    System.out.println("Цифры " + number + " числа образуют возрастающую последовательность.");
        }
    }
}
