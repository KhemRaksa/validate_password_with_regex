/*

A password is considered valid if all the follwing constraints are satisfied:
. contains atleast 8 chars and at most 20 chars
. contains atleast 1 digit
. contains atleast one upper case alphabet
. contains atleast one lower case alphabet
. contains atleast one special character which includes !@#$%&*()-+=^.
. doesn't contain any whitespace
 */

import java.util.regex.*;

class validatePasswordWithRegex {

    public static boolean isValidPassword (String password){

        //Regex To Check Valid Password
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";


        //Compile The Regex
        Pattern p = Pattern.compile(regex);

        //If the password is empty, return false
        if(password == null){
            return false;
        }

        // The pattern class contains matcher method to find matching between given password and regular expression
        Matcher m = p.matcher(password);

        // return true or false if password matches the regex
        return m.matches();

    }

}

public class Main {
    // Driver Code
    public static void main(String[] args) {

        String str1 = "Geeks@portal20";
        System.out.println(validatePasswordWithRegex.isValidPassword(str1));

        String str2 = "Geeksforgeeks";
        System.out.println(validatePasswordWithRegex.isValidPassword(str2));

        String str3 = "1234";
        System.out.println(validatePasswordWithRegex.isValidPassword(str3));

        String str5 = "Gfg@20";
        System.out.println(validatePasswordWithRegex.isValidPassword(str5));

    }
}
