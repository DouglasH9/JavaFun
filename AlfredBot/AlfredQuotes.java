package AlfredBot;

import java.util.Date;

import java.text.SimpleDateFormat;


public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod){
        return "Good " + dayPeriod + ", " + name + " lovely to see you";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String dateString = formatter.format(date);
        return "The current date is: " + dateString;
    }

    public String respondBeforeAlexis(String conversation){
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away sir, she certainly isn't sophisticated enough for that";
        }
        else if (conversation.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }

}
