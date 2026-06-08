import java.util.Scanner;

public class SecondsConverter
{

    public static void main(String [] args)
    {
        Scanner kbd = new Scanner(System.in);
        {

        System.out.print("Enter the number of seconds: ");
        int totalSeconds = kbd.nextInt();

        int userHours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int userMinutes = remainingSeconds / 60;
        int userSeconds = remainingSeconds % 60;

        System.out.println(" ");

        System.out.println("Hours: " + userHours);

        System.out.println("Minutes: " + userMinutes);

        System.out.println("Seconds: " + userSeconds);

        /* end the scanner here */
        kbd.close();
        }
    }
}
