public class practiceJava {
    
    public static void main(String[] args) {
      
        //print("Hello");
        //print("Nope");
        //sum(10,15);
        //StringDemo("Welcome to the party");
        StringDemo("Well then this cool");

    }
    public static void print(String s){
        if (s == "Hello"){
            System.out.println("Hello right back to you");
        }else{
            System.out.println("Anyone there?");
        }
    }
    public static int sum (int num, int num2){

        int total = num + num2;
        System.out.println(total);
        return total;  
    }
    public static String StringDemo(String s){
        String tooMany = "       To many characters   ";
        String ninja = s;
        int length = ninja.length();
        String StringCorrect = "String length of "+ ninja + " is :" + length;
        if (length > 10){
            System.out.println(tooMany.trim()); // trim removes leading and trailing spaces 
            return tooMany;
        }else{
            System.out.println(StringCorrect);
            return StringCorrect;
        }
    }

}