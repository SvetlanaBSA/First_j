import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введтте длину массива: ");
        int lengthArray = scanner.nextInt();
        scanner.close();
        int[] numArray = new int [lengthArray];
        for(int i = 0; i < lengthArray; i++){
            numArray[i] = (int) (Math.random()*100);
            System.out.print(numArray[i] + " ");
        }
        System.out.println();
        Arrays.sort(numArray);
        System.out.println("Массив по возрастанию:");
        for(int i = 0; i < lengthArray; i++){
            System.out.print(numArray[i] + " ");
        }
    }
}
