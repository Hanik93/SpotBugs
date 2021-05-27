package Aufgaben;

import java.text.SimpleDateFormat;
import java.util.Date;

// Analysieren Sie die Aufgabe mithilfe von SpotBugs und versuchen Sie anschließen eine Lösung für den Bug zu finden
public class Aufgabe4 {
    protected static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public String format(Date date) {
        return df.format(date);
    }
}
