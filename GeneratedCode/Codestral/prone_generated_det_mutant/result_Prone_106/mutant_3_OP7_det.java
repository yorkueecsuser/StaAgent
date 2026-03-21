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
        boolean exlaxyru = false;while (exlaxyru && true && true && true && false && false && false && true && true && true && true && false) {boolean fdslqims = true;}
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