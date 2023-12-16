package Java_Strings;

class Palindrome_String {
    public static void main(String[] args) {
        String str = "recap";
        boolean isPalin = isPalindrom(str);
        System.out.println("Is " + str + " is a Palindrome? : " + isPalin);
    }

    public static boolean isPalindrom(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i))
                return false;
        }
        return true;

    }
}