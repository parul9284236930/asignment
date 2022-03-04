

import java.util.Scanner;
import java.util.function.Predicate;

    class User3{
        String username;
        String password;
        public User3(String username, String password) {
            super();
            this.username = username;
            this.password = password;
        }
    }
    public class TestUserPredicate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Predicate<User3> u =
                    usr-> usr.username.equals("admin") && usr.password.equals("admin");
            System.out.println("enter user name");
            String uname = sc.next();
            System.out.println("enter password");
            String passwd = sc.next();
            User3 user = new User3(uname,passwd);
            if(u.test(user))
                System.out.println("Valid user");
            else
                System.out.println("Invalid user");

        }
    }