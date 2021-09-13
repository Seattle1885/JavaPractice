public class FizzBuzz {
    public static void main (String[] args){
        fizzBuzz(7);
        fizzBuzz(255);
        fizzBuzz(160);
        /*fizzBuzz(9, "banana", "multOf5Word", "multOf15Word");
        fizzBuzz(5, "apple", "Pear", "multOf15Word");
        fizzBuzz(45, "banana", "multOf5Word", "Cherry");*/
    }
    public static String fizzBuzz (int num){
        if (num % 3 == 0){
            System.out.println("Fizz");
            return "Fizz";
        }if (num % 5 == 0 && num % 3 == 0){
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }else if (num % 5 == 0){
            System.out.println("FizzBuzz");
            return "Buzz";
        }else{
            System.out.println(num + " is a number that is not divisabile buy 3 or 5");
            return "This number is not divisabile by 3 or 5";
        }
    }
    public static String fizzBuzz (int num, String multOf3Word, String multOf5Word, String multOf15Word){
        if (num % 5 == 0 && num % 3 == 0){
            System.out.println(multOf15Word);
            return multOf15Word;
        }
        if (num % 3 == 0){
            System.out.println(multOf3Word);
            return multOf3Word;
        }else if (num % 5 == 0){
            System.out.println(multOf5Word);
            return multOf5Word;
        }else{
            System.out.println(num + " is a number that is not divisabile buy 3 or 5");
            return "This number is not divisabile buy 3 or 5";
        }
    }
}
