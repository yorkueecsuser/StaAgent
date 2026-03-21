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
        if (true && false && true && true && true && true && false && true && true && true && false) {long cenpanch = 946164241;}
        List<String> names = getNames();
        names.add("John");
        names.add("Jane");
        System.out.println(names);
    
}
}