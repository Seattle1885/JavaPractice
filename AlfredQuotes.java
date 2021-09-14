import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod){
        return "Good "+ dayPeriod + ", "+ name + ". Lovely to see you";
    } 
    public String dateAnnoucement(){ 
        Date currentDate = new Date();
        return "The current date is : " + currentDate;
    }
    public String respondBeforeAlexis(String conversation){
        int Alexis = conversation.indexOf("Alexis");
        int Alfred = conversation.indexOf("Alfred");
        if (Alexis >= 0){
            return "Alfred here right away, sir. Alexis certainly isn't sophisticated enough for that.";
        }else if (Alfred >= 0){
            return "At your service. As you wish, naturally.";
        }else return "Right. And with that I shall retire.";
    }
}
