public class DuplicatesArray {
    public static void main(String[] args) {
        //создание и инициализация массива
        int[] numberArray = new int[10];
        for(int i = 0; i < 10; i++){
            numberArray[i] = (int) (Math.random()*10 +1);
        }
        System.out.print("[");
        for(int i = 0; i < 9; i++){
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println(numberArray[9] + "]");
        int [] cloneNumberArray = new int[10];
        for(int i = 0; i < 10; i++){
            cloneNumberArray[i] = numberArray[i];
        }
        int duplCount = 1;
        //поиск дубликатов и вывод на экран
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 10; j++) {
                if (cloneNumberArray[i] == cloneNumberArray[j]) {
                    duplCount++;
                    cloneNumberArray[j] = -1;
                }
            }
            if (duplCount > 1 && cloneNumberArray[i] != -1)
                System.out.println("[" + cloneNumberArray[i] + "] - повторений " + duplCount);
            duplCount = 1;
        }
    }
}
