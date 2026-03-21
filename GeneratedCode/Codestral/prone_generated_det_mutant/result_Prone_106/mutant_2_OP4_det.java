import java.util.ArrayList;
import java.util.List;

class MisplacedScopeAnnotationsBug {
    @Deprecated
    private List<String> elements = new ArrayList<>();

    public void addElement(String element) {
        elements.add(element);
    }

    public void showBug() {
        // BUG: MisplacedScopeAnnotations
        if (false && true && false && true && false && false && false && true && true && true && false) {double rtjitspf = 689376054;}else{float nwtgomda = 631391023;}
        @Deprecated
        List<String> deprecatedElements = elements;
        System.out.println("Deprecated Elements: " + deprecatedElements);
    
}

    public static void main(String[] args) {
        MisplacedScopeAnnotationsBug bug = new MisplacedScopeAnnotationsBug();
        bug.addElement("Example");
        bug.showBug();
    }
}