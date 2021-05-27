package Aufgaben;

// Welchen Bug könnte SpotBugs hier finden? Analysieren Sie die Aufgabe mithilfe von SpotBugs und versuchen Sie anschließen den Bug zu lösen

public class Aufgabe6 {

    private String placeHolder = null;


    public Aufgabe6() {
        this.placeHolder = "Test String";
    }

    public String getPlaceHolder(){
        return this.placeHolder;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Aufgabe6)){
            return false;
        }
        Aufgabe6 object = (Aufgabe6) obj;
        return this.getPlaceHolder().equals(object.getPlaceHolder());
    }
}
