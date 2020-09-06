package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<Message>();

    public static void setMessages(List<Message> messages) {
        MessageDatabase.messages = messages;
    }

    public static void sendMessage(User u1, User u2, String text){
        MessageDatabase.messages.add(new Message(u1, u2, text));
    }

    public static void showDialog(User u1, User u2){
        for (Message mess:messages){

            if(mess.getSender().getUsername().equals(u1.getUsername()) && mess.getReceiver().getUsername().equals(u2.getUsername())
            || mess.getSender().getUsername().equals(u2.getUsername()) && mess.getReceiver().getUsername().equals(u1.getUsername())){
                System.out.println(mess.getSender().getUsername() + " : " + mess.getText());
            }

        }
    }

}
