package io.bufferedwriterreader;

import java.io.*;

public class BufferedWriterReader {
    String path;

    public BufferedWriterReader(String path){
        this.path = path;
    }

    public void BuffWriter(String st) throws IOException {
        BufferedWriter buff = new BufferedWriter(new FileWriter(path));
        buff.write(st);
        buff.close();
//
//        BufferedWriter buff1 = new BufferedWriter(new FileWriter("E:/data.txt"));
//        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        while(!buff.readLine().equals("stop")){
//            buff1.write(buff.readLine());
//            System.out.println("xyz");
//        }
//        buff.close();
//        buff1.close();
    }
    public void BuffReader() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String c;
        while ((c=buffRead.readLine()) != null){
            System.out.println(c);
        }
        buffRead.close();
    }
}
