import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the username: ");
        userName = scan.nextLine();

        System.out.print("Enter the password: ");
        password = scan.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))){
            System.out.println("Successfully logged in!");
        }
        else if (userName.equals("patika") && (password != "java123")){
            System.out.println("Password is wrong!");
            System.out.println("Do you want to reset your password?\n1-Yes 2-No");
            int selection = scan.nextInt();

            switch (selection){
                case 1:{
                    System.out.println("Enter the new password: ");
                    scan.nextLine();
                    newPassword = scan.nextLine();

                    if(newPassword.equals(password) || newPassword.equals("java123")){
                        System.out.print("New password cannot be the same as the older one or the last try!");
                    }
                    else if(newPassword != password){
                        System.out.print("Password has changed successfully!");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Login failed!");
                    break;
                }
            }
        }
        else{
            System.out.println("Wrong password and username! Login failed!");
        }

    }
}
