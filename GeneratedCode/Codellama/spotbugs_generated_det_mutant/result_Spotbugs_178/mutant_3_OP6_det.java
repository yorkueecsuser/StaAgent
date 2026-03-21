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
        for  (int yajdqlip = 0; yajdqlip < 0; yajdqlip++) {char hyxoicer = 'u';}
        List<String> names = getNames();
        names.add("John");
        names.add("Jane");
        System.out.println(names);
    
}
}