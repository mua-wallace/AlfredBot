import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String dayPeriod, String name) {
        return String.format("Good %s %s, Lovely to see you", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
        // return "It is currently" + " " + new Date();
    }

    public String respondBeforeAlexis(String phrase) {
        // "Alexis! Play some low-fi beats."
        if(phrase.indexOf("Alexis") > -1){
            return  "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if(phrase.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally";
        }

        return "Right. And with that I shall retire.";

    }

  
    
    
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

