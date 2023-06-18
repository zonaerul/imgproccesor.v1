import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Imgprocessor {
    public static String setInputUrl(String url,String path) {
        String output = null;
        try {
            InputStream input = new URL(url).openStream();
            BufferedInputStream bf = new BufferedInputStream(input);
            FileOutputStream out = new FileOutputStream(path);
            BufferedOutputStream o = new BufferedOutputStream(out);
            int i = 0;
            while (i!=-1){
                i=bf.read();
                o.write(i);
            }
            bf.close();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}
