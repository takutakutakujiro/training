import java.util.*;

public class Test{
    public static void main (String[] args){

        Color[] color = Color.values();

        for (Color c : color){
            System.out.println(c);
        }
    }
}

enum Color {
    RED,
    BLUE,
    BLACK
}

