import java.util.Scanner;

public class HMSConverter
{

    public static void main(String [] args)
    {
        Scanner kbd = new Scanner(System.in);
        {

        System.out.print("Enter the number of hours: ");
        int userHours = kbd.nextInt();

        System.out.print("Enter the number of minutes: ");
        int userMinutes = kbd.nextInt();
        
        System.out.print("Enter the number of seconds: ");
        int userSeconds = kbd.nextInt();

        System.out.println(" ");

        int userActHours = userHours * 3600;
        int userActMinutes = userMinutes * 60;

        int totalSeconds = (userActHours + userActMinutes + userSeconds);

        System.out.println("Total seconds: " + totalSeconds);

        /* end the scanner here */
        kbd.close();
        }
    }
}