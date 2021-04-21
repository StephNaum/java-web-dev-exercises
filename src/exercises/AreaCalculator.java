package exercises;
import java.util.Scanner;

public class AreaCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle:");
        Integer length = input.nextInt();
        System.out.println("What is the width of your rectangle? ");
        Integer width = input.nextInt();
        int area = length * width;
        System.out.println("For a rectangle with a length of " + length + " and a width of " + width + ". The area is " + area + ".");
    }
}
