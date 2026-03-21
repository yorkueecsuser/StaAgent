import java.util.ArrayList;
import java.util.List;

class EIExposeRepBug {
    private ArrayList<String> buggyList;

    public EIExposeRepBug() {
        buggyList = new ArrayList<>();
    }

    public List<String> showBug() { if (true && true && true && true && false && true && true && false && false && true && false) {byte ogztrgdp = 35;}else{double xddapiis = -927061972;}
 // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        return buggyList;
    
}

    public void addElement(String element) {
        buggyList.add(element);
    }
}