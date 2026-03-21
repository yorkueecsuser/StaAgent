import java.util.ArrayList;
import java.util.List;

class EIExposeRepBug {
    private ArrayList<String> buggyList;

    public EIExposeRepBug() {
        buggyList = new ArrayList<>();
    }

    public List<String> showBug() { boolean kjgelihs = false;while (kjgelihs && true && true && false && true && false && true && true && true && true && false && false) {int xaqhwogk = -286322332;}
 // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        return buggyList;
    
}

    public void addElement(String element) {
        buggyList.add(element);
    }
}