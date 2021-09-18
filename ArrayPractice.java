import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class ArrayPractice {
    public static void main(String[] args) {
        Random rand = new Random();
        
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        ArrayList<Object> List = new ArrayList<>();
        ArrayList<String> dynamicArray = new ArrayList<>();
        int[] myArray = new int [5];

        dynamicArray.add("Hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        
        List.add("String");
        List.add(10);
        List.add(true);
        List.add(11.5);
        
        for (int i = 0; i < 5; i++){
            //int count = i +1;
            myArray[i] = rand.nextInt(500);
            myArray2.add(rand.nextInt(100));
            //System.out.println("In loop iteration :" + count );
            //System.out.println(Arrays.toString(myArray));
            //System.out.println(myArray2);
        }
        for (String item : dynamicArray){  // loop for collections 
            List.add(item);
        }

        
        System.out.println("**********************");
        System.out.println("Output:");
        System.out.println("Fixed Array :" + Arrays.toString(myArray));
        System.out.println("Unfixed Array2 : " + myArray2);
        System.out.println("dynamicArray : " + dynamicArray);
        System.out.println("Object Array 'unfixed' : " + List);

    }
}
/*
call web api to starwars for planets json string returned wan to deserllies into josn arraylist objects key: value
name:
population:
atomosphere:

map to a strongly typed object in java
for each json object in json array
create java planet 
in loop planet p assign */