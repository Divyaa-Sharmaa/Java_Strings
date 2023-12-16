package Java_Strings;

public class findDisplacement {
    public static void main(String[] args) {
        String s = "NEEESWN"; // WNEENESENNN
        float displacement = getShortestPath(s);
        System.out.println("Shortest Path is: " + displacement);
    }

    public static float getShortestPath(String s) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'W') {
                x--;
            } else {
                x++;
            }
        }
        float x2 = x * x;
        float y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }
}
