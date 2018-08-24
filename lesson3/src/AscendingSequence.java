import java.util.Scanner;

public class AscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();
        //преобразуем число в строку и найдем ее длину для определия кол-ва символов массива
        String numberDuplicate = Integer.toString(number);
        int numberLength = numberDuplicate.length();
        //инициализация массива
        int[] numberArray = new int[numberLength];
        for(int i = 0; i < numberLength; i++){
            numberArray[i] = number / (int) (Math.pow(10, numberLength-i-1));
            number -= numberArray[i] * (int) (Math.pow(10, numberLength-i-1));
        }
        //является ли возрастающей последовательностью
        for(int i = 1; i < numberLength; i++){
            if (numberArray[i-1] != numberArray[i] - 1){
                System.out.println("Цифры " + numberDuplicate + " числа НЕ образуют возрастающую последовательность.");
                break;
            }
            else
                if (i == numberLength - 1)
                    System.out.println("Цифры " + numberDuplicate + " числа образуют возрастающую последовательность.");
        }
    }
}
