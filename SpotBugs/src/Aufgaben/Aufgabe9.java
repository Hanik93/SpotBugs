package Aufgaben;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Welchen Bug könnte SpotBugs hier finden? Analysiere den Code mithilfe von SpotBugs und versuche anschließend den Bug zu lösen

public class Aufgabe9 {

   private static void writeFile(String content) throws IOException {
        FileWriter fileWriter = new FileWriter(new File("src/Files/testFile"));
        fileWriter.write(content);
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        writeFile("randomContent");
    }


}
