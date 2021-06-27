package Loesungen;

import java.io.*;

public class Aufgabe9 {
    private static void writeFile(String content) throws IOException {
        Writer writer = new OutputStreamWriter(new FileOutputStream( "src/Files/testfile.txt"), "UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(content);
        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        writeFile("randomContent");
    }
}

