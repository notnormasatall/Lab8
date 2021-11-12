package adapter;

import lombok.Setter;
import twitter.TwitterUser;

import java.util.Date;

@Setter
public class TwitterAdapter implements User{
    private TwitterUser userObj;

    public TwitterAdapter(TwitterUser twUser) {
        this.userObj = twUser;
    }

    public String getEmail(){
        return userObj.getUserMail();
    }

    public String getCountry(){
        return userObj.getCountry();
    }

    public Date getDate() {
        return userObj.getLastActiveTime();
    }
}

