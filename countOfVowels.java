package Java_Strings;

public class countOfVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int totalVowels = countOfVowel(str);
        System.out.println("number of lowercase vowels user entered: " + totalVowels);

    }

    public static int countOfVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

}
