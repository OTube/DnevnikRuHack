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
}
