//Q4:Write a Java Program to find the duplicate characters in a string.
public class DuplicateCharacters{
    public static void main(String[] args) {
        String str = "Program to find duplicate characters";

        System.out.println("Duplicate characters in the string '" + str + "':");
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        str = str.toLowerCase();
        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}
