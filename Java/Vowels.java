package Java;

public class Vowels {
    public static boolean isVowelPresent(String s) {
        return s.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args) {
        String input = "BrowerStack";
        System.out.println("Vowel present: " + isVowelPresent(input));
    }
}
