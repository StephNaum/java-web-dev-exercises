package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Total miles travelled: ");
        double miles = input.nextDouble();
        System.out.println("Total gallons consumed: ");
        double gallons = input.nextDouble();
        double milesPerGallon = miles / gallons;
        System.out.println("You averaged " + milesPerGallon + " miles per gallon on this trip.");
    }
}
