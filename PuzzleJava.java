import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();

    // Method generate & return 10 random numbers
    public ArrayList<Integer> arrayTenRandNumsGen (){
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        System.out.println("arrayInt values currently is :" + myArray2);
        for (int i = 0; i < 10; i++){
            myArray2.add(randMachine.nextInt(20)); 
        }
        
        System.out.println("arrayInt values currently is :" + myArray2);
        return myArray2;
    }


    public String randomLetterGenerator(){
        String [] abcArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String letter = abcArray[randMachine.nextInt(25)];
        //System.out.println(letter);
        return letter;
    }

    // Create random string of eight characters and return string
    public String generatePasswordString(int lengthOfPass){
        ArrayList<String> stringArray = new ArrayList<>();

        for (int i = 0; i < lengthOfPass; i++){
            stringArray.add(randomLetterGenerator());
        }

        String stringArrayJoined = String.join("", stringArray);
        System.out.println(stringArrayJoined);

        return stringArrayJoined;
    }

}
