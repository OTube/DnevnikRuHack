import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static int bomb(char[] rb){
        try {
            URL myURL = new URL("https://dnevnik.ru");
            URLConnection myURLConnection = myURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
            int readed;
            int total = 0;
            while((readed = in.read(rb)) > 0) total += readed;
            in.close();
            return total;
        } catch (IOException e){throw new RuntimeException(e);}
        return 0;
    }
    public static void main(String[] args){
        char[] pull = new char[1000000];
        for(int i = 0; i < 100; ++i){
            System.out.println("read: " + bomb(pull));
        }
    }
}
