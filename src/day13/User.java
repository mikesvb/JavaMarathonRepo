package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public boolean isSubscribed(User user){

        for (User userSub:subscriptions){
            if(userSub.getUsername().equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

	public boolean isFriend(User user1, User user2){
        boolean returnFriend=false;

        boolean sub1 = user2.isSubscribed(user1);
        boolean sub2 = user1.isSubscribed(user2);

        if(sub1 && sub2){
            returnFriend=true;
        }

        return returnFriend;
    }

    public void sendMessage(User user, String text){
        new Message(this, user, text);
    }

    @Override
    public String toString() {
        return this.username;
    }
}
