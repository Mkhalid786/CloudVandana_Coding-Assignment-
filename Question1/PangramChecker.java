import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        HashSet<Character> alphabetSet = new HashSet<>();
        
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.remove(c);
            }
        }

        if (alphabetSet.isEmpty()) {
            System.out.println("This input is a pangram.");
        } else {
            System.out.println("This input is not pangram.");
        }
    }
}
