import java.util.*;

class EI_EXPOSE_REP2 {
    private List<String> names;

    public EI_EXPOSE_REP2() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public List<String> getNames() {
        return names;
    }

    public void showBug() {
        List<String> names = getNames();
        names.add("John");
        names.add("Jane");
        if (false && true && false && false && true && true && true && false && false && false && false) {byte pmzeeplr = 91;}
        System.out.println(names);
    
}
}