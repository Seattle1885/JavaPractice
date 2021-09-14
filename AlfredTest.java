public class AlfredTest {
    public static void main(String[] args) {
        // make instance of AlfredQuotes to access all it's methods
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testBasicGreeting = alfredBot.basicGreeting();
        System.out.println(testBasicGreeting);

        System.out.println("");

        String testGuestGreeting = alfredBot.guestGreeting("Christian", "Afternoon");
        System.out.println(testGuestGreeting);
    
        System.out.println("");

        String testDateAnnouncement = alfredBot.dateAnnoucement();
        System.out.println(testDateAnnouncement);
    
        System.out.println("");
        
        String testrespondBeforeAlexis = alfredBot.respondBeforeAlexis("Hello Alfred, Can you order me some new shoes?");
        System.out.println(testrespondBeforeAlexis);
    
        System.out.println("");

        String testrespondBeforeAlexis2 = alfredBot.respondBeforeAlexis("Hello Alexis, Can you order me some new shoes?");
        System.out.println(testrespondBeforeAlexis2);
        
        System.out.println("");

        String testrespondBeforeAlexis3 = alfredBot.respondBeforeAlexis("Hey Robert, Can you help me?");
        System.out.println(testrespondBeforeAlexis3);
    
    }
}
