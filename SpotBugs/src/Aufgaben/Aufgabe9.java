package Aufgaben;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Welchen Bug könnte SpotBugs hier finden? Analysieren Sie die Aufgabe mithilfe von SpotBugs und versuchen Sie anschließen den Bug zu lösen
public class Aufgabe9 {
    private static void toFile(String contents, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(contents);
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        File testFile = new File("src/Files/testFile");
        toFile("42", testFile);
    }
}
