import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class ArrayPractice {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> myArray1 = new ArrayList<Integer>();
        //ArrayList<Object> List = new ArrayList<>();
        ArrayList<String> dynamicArray = new ArrayList<>();
        dynamicArray.add("Hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        
        int[] myArray = new int [5];
        for (int i = 0; i < 5; i++){
            int count = i +1;

            myArray[i] = rand.nextInt(500);
            myArray1.add(rand.nextInt(100));
            System.out.println("Iteration :" + count );
            System.out.println(Arrays.toString(myArray));
            System.out.println(myArray1);
        }

        System.out.println("**********************");
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray1);

        for (int i = 0; i <dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
        System.out.println(dynamicArray);
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