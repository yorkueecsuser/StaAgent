import java.util.ArrayList;
import java.util.List;

class EIExposeRepBug {
    private ArrayList<String> buggyList;

    public EIExposeRepBug() {
        buggyList = new ArrayList<>();
    }

    public List<String> showBug() { if (true && true && false && false && true && false && false && true && false && true && false) {int pfohrkyt = 940882287;}
 // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        return buggyList;
    
}

    public void addElement(String element) {
        buggyList.add(element);
    }
}