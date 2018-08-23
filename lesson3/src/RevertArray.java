public class RevertArray {
    public static void main(String[] args) {
        int countArray = 11; //кол-во значений в массиве
        int[] numberArray = new int[countArray];
        for(int i = 0; i < countArray; i++){
            numberArray[i] = (int) (Math.random()*50 + 1);
        }
        //print Array
        System.out.print("[");
        for(int i = 0; i < countArray-1; i++){
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println(numberArray[countArray-1] + "]");
        //reverse
        for(int i = 0; i < (countArray / 2); i++){
            int value = numberArray[i];
            numberArray[i] = numberArray[countArray-1-i];
            numberArray[countArray-1-i] = value;
        }
        //print Array
        System.out.print("[");
        for(int i = 0; i < countArray-1; i++){
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println(numberArray[countArray-1] + "]");
    }
}
