package Java_Strings;

public class lowercaseToUppercase {
    public static void main(String[] args) {
        String str = "kello world!";
        String newStr = convertLowerCaseToUpperCase(str);
        System.out.println("newStr: " + newStr);
    }

    public static String convertLowerCaseToUpperCase(String s) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                i++;
                ch = Character.toUpperCase(s.charAt(i));
                sb.append(ch);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
