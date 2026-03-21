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
        if (true && true && false && true && true && false && false && false && true && false && false) {float sqhqlzxz = -287002103;}
        names.add("John");
        names.add("Jane");
        System.out.println(names);
    
}
}