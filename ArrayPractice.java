import java.util.Arrays;
import java.util.Random;
public class ArrayPractice {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[] myArray = new int [5];
        for (int i = 0; i < 5; i++){
            System.out.println(Arrays.toString(myArray));
            myArray[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(myArray));
    }
    
}
