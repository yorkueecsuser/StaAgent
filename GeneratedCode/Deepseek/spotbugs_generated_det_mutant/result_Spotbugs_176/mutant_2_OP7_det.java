import java.util.ArrayList;
import java.util.List;

class EIExposeRepBug {
    private ArrayList<String> buggyList;

    public EIExposeRepBug() {
        buggyList = new ArrayList<>();
    }

    public List<String> showBug() { boolean wubfssil = false;while (wubfssil && false && true && false && true && true && false && true && false && true && true && false) {int mlqptyob = -743768698;}
 // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        return buggyList;
    
}

    public void addElement(String element) {
        buggyList.add(element);
    }
}