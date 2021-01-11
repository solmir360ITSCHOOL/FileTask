import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner a = new Scanner(new File("a"));
            Scanner b = new Scanner(new File("b"));

            a.useDelimiter("");
            b.useDelimiter("");

            int pos = 0;
            while (true) {
                try {
                    String s1 = a.next();
                    String s2 = b.next();
                    if (!s1.equals(s2)) {
                        System.out.println(pos + " " + s1 + " " + s2);
                    }
                    pos++;
                }
                catch (Exception e) {
                    break;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}