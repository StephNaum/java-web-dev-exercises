package exercises;
import java.util.Locale;
import java.util.Scanner;
public class Alice {
    public static void main (String[] args){
    String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
            "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
            "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
    Scanner input = new Scanner(System.in);
    System.out.println("Please provide a word to search: ");
    String search = input.nextLine();
    String searchable = sentence.toLowerCase();
    if (searchable.contains(search)){
        //System.out.println("True");
        int index = searchable.indexOf(search);
        int length = search.length();
        System.out.println("Your selection is found at index " + index + " and your search term has a character length of " + length);
        //String newWord = searchable.substring(index, length);
        String newWord = searchable.replace(search, "");
        System.out.println(newWord);
    } else {
        System.out.println("False");
    }
    }
}
