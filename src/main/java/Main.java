import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world~!");

//y        System.out.printf("%2d\t%s%n", 1, Main.class.getResource(""));
//y        System.out.printf("%2d\t%s%n", 3, Main.class.getResource("/"));
//y        System.out.printf("%2d\t%s%n", 2, Main.class.getResource("."));
//x        System.out.printf("%2d\t%s%n", 4, String.class.getResource(""));
//x        System.out.printf("%2d\t%s%n", 5, String.class.getResource("."));
//y        System.out.printf("%2d\t%s%n", 6, String.class.getResource("/"));
        System.out.printf("%2d\t%s%n", 7, Main.class.getResource("abcd/data.txt"));
//y        System.out.printf("%2d\t%s%n", 8, Main.class.getResource("./abcd/data.txt"));
        System.out.printf("%2d\t%s%n", 9, Main.class.getResource("/abcd/data.txt"));
//x        System.out.printf("%2d\t%s%n", 10, String.class.getResource("abcd/data.txt"));
//x        System.out.printf("%2d\t%s%n", 11, String.class.getResource("./abcd/data.txt"));
//y        System.out.printf("%2d\t%s%n", 12, String.class.getResource("/abcd/data.txt"));

//y        System.out.printf("%2d\t%s%n", 13, Main.class.getClassLoader().getResource(""));
//y        System.out.printf("%2d\t%s%n", 14, Main.class.getClassLoader().getResource("."));
//x        System.out.printf("%2d\t%s%n", 15, Main.class.getClassLoader().getResource("/"));
        System.out.printf("%2d\t%s%n", 16, Main.class.getClassLoader().getResource("abcd/data.txt"));
//y        System.out.printf("%2d\t%s%n", 17, Main.class.getClassLoader().getResource("./abcd/data.txt"));
//x        System.out.printf("%2d\t%s%n", 18, Main.class.getClassLoader().getResource("/abcd/data.txt"));

        BufferedReader br = null;

        try {
//            InputStream is = Main.class.getClassLoader().getResourceAsStream("abcd/data.txt");
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("abcd/data.txt");
            br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            while (line != null) ;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }


        System.out.println();
    }
}
