package io.gzip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
       byte[] buff = new byte[1024];
        GZIPOutputStream gZipObj = new GZIPOutputStream(new FileOutputStream("E:/data.gz"));
        FileInputStream file = new FileInputStream("E:/data.txt");
        int len;
        while((len = file.read(buff)) > 0){
            gZipObj.write(buff, 0, len);
        }
        file.close();
        gZipObj.finish();
        gZipObj.close();
    }
}
