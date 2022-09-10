import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void bomb(char[] rb){
        try {
            URL myURL = new URL("https://dnevnik.ru");
            URLConnection myURLConnection = myURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
            int readed;
            int total = 0;
            while((readed = in.read(rb)) > 0){
                total += readed;
            }
            in.close();
            System.out.println("read: " + total);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        char[] b = new char[100000];
        for (int i = 0; i < 100; i++) {
            bomb(b);
            System.out.println("bombed: " + i);
        }
    }
}
