package Strings;

import java.lang.Math;

public class ShortestPath {
    public static void main(String[] args) {
        String str1 = "WNEENESENNNN";
        int x = 0;
        int y = 0;
        for (int i = 0; i < str1.length(); i++) {
            char curr = str1.charAt(i);
            if (curr == 'W') {
                x--;
            } else if (curr == 'E') {
                x++;
            } else if (curr == 'N') {
                y++;
            } else {
                y--;
            }
        }
        double dis = Math.sqrt(y * y - x * x);
        System.out.println(dis);
    }
}
