package Lab7.task4;

public class UserAccount {
    String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }

    public boolean changePassword(String oldPassword, String newPassword){
        if (oldPassword.equals(password)){
            System.out.println("Password changed");
            password = newPassword;
            return true;
        }else {
            System.out.println("Incorrect old password");
            return false;
        }
    }
}