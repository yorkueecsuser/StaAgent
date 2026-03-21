import java.util.ArrayList;
import java.util.List;

class EIExposeRepBug {
    private ArrayList<String> buggyList;

    public EIExposeRepBug() {
        buggyList = new ArrayList<>();
    }

    public List<String> showBug() { int biaadire = 0;switch  (biaadire) {case 1:byte hzyrlhfz = -122;break;default:boolean utpehkqt = false;break;}
 // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        return buggyList;
    
}

    public void addElement(String element) {
        buggyList.add(element);
    }
}