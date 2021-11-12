package adapter;

import facebook.FacebookUser;
import lombok.Setter;

import java.util.Date;

@Setter
public class FacebookAdapter implements User{
    private FacebookUser userObj;

    public FacebookAdapter(FacebookUser fbUser) {
        this.userObj = fbUser;
    }

    public String getEmail(){
        return userObj.getEmail();
    }

    public String getCountry(){
        return userObj.getUserCountry();
    }

    public Date getDate() {
        return userObj.getUserActiveTime();
    }
}
