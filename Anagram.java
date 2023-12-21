package Java_Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "races";
        String str1 = "cares";
        boolean isAnagram = checkIfAnagram(str, str1);
        System.out.println("isAnagram: " + isAnagram);
    }

    public static boolean checkIfAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int j = 0; j < c1.length; j++) {
            if (c1[j] != c2[j]) {
                return false;
            }
        }
        return true;
    }
}
