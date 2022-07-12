package io.dataoutputinputstream;

import java.io.*;

public class DataOutputInputStream {

    private final String path;

    public DataOutputInputStream(String path){
        this.path = path;
    }

    public void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
        out.writeUTF("Hello UTF");
        out.flush();
    }

    public void read() throws IOException{
        DataInputStream in = new DataInputStream(new FileInputStream(path));
        String data = in.readUTF();
        System.out.println(data);
    }
}
