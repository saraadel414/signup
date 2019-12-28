package signup;

import java.util.ArrayList;
import static signup.user.name;
import static signup.user.pass;

/**
 *
 * @author lenovo
 */

public class  CashedUser{
//String username;
//String password;
user userr;

    public user getUser( String username ,String password){
if(userr==null){
    if (name.contains(username)&& pass.contains(password))
        {
            return userr;
        }

}
    return userr;
}
}
