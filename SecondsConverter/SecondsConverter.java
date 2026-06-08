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
        int userMinutes = totalSeconds / 60;

        System.out.println("Hours: " + userHours);

        System.out.println("Minutes: " + userMinutes);



        /* end the scanner here */
        kbd.close();
        }
    }
}
