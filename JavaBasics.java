import java.util.ArrayList;


public class JavaBasics {

    //print numbers method
    public int  printNumbers(int numbers){
        int sum = 0;
        for (int i = 0; i <= numbers; i++){
            sum = i;
            System.out.println(sum);
        }
        return sum;
    }

    //Print odd numbers with given input
    public void printOddNumbers(int numbers){
        for (int i = 0; i <= numbers; i++ ){
            if (i % 2 == 1){
                //System.out.println(i + " % " + 2 + " = " + i%2);
                System.out.println(i);
            }
        }
    }

    //return the variable "sum" of 1-255 added together
    public int returnSum (int number){
        int sum = 0;
        
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        
        System.out.println(sum);
        return sum;
    }

    //iterate through array
    public void iterateArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    // find max value in array
    public void maxArrayValue(int [] intArray){
        int maxValue = intArray[0];
        
        for (int i = 1; i < intArray.length; i++){   
            if (intArray[i] > maxValue){
                maxValue = intArray[i];
            }
        }
        System.out.println(maxValue);
    }

    //Array with odd numbers
    public void oddNumsArrayCreator (int num){
        ArrayList<Integer> y = new ArrayList<Integer>();
        
        for (int i = 0; i < num; i++){
            if (i % 2 == 1){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    //Get average of array values
    public double averageOfArrayValues(int[] array){
        double sum = 0.0;
        
        for (int i = 0; i < array.length; i++){
            System.out.println("array index value of " + i + " :" + array[i]);
            sum += array[i];
            System.out.println("");
            System.out.println("Value of sum is : " + sum);
            System.out.println("");
            System.out.println("***************************");
        }
        
        double average = sum / array.length;
        System.out.println(average);
        
        return average;
    }

    // return array values greater than y  
    public int arrayValueGreaterThanY(int[] array, int y){
        int greaterThanY = 0;
        
        for(int i = 0; i < array.length; i++){
            if (array[i] > y){
                greaterThanY = array[i];
            }
        }
        if (greaterThanY == 0){
            System.out.println("There is no value greater than y = " + y);
            
            return greaterThanY;
        }
        System.out.println(greaterThanY);
        return greaterThanY;
    }
    
    //eliminate negative numbers in an array
    public ArrayList<Integer> removeArrayNegNums(int[] array){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                newArray.add(array[i]);
            }
        }
        System.out.println(newArray);
        
        return newArray;
    }

    //Min, Max and Average of Array int values
    public ArrayList<Integer> minMaxAverageArray(int[] array){
        ArrayList<Integer> minMaxAvgArray = new ArrayList<Integer>(); 
        int minValue = array[0];
        int maxValue = array[0];
        int sum = 0;
        
        for (int i = 1; i < array.length; i++){ // loop to find min value
            if (array[i] < minValue ){
                minValue = array[i];
            }
            if (array[i] > maxValue){
                maxValue = array[i];
            }
            sum += array[i];
        }
        
        int average = sum / array.length;
        
        minMaxAvgArray.add(minValue);
        minMaxAvgArray.add(maxValue);
        minMaxAvgArray.add(average);
        
        System.out.println("Min value of array is : " + minValue);
        System.out.println("Max value of array is : " + maxValue);
        System.out.println("Average for array is : " + average);
        System.out.println(minMaxAvgArray);
        
        return minMaxAvgArray;
    }
}
