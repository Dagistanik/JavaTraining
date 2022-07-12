package io.outputinputstreamexam;

import java.io.IOException;

public class Main {
    private static final String PATH = "E:/data.txt";


    public static void main(String[] args) throws IOException {
        InputOutputStreamExam inputOutputStreamExam = new InputOutputStreamExam(PATH);
        inputOutputStreamExam.write("Hello World ");
        inputOutputStreamExam.read();
    }
}
