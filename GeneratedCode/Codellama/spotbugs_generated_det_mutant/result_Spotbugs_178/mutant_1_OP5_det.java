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
        int lulbkzuv = 0;switch  (lulbkzuv) {case 1:char qbjmyvhc = 'd';break;default:short ynijjmzt = 4884;break;}
        names.add("John");
        names.add("Jane");
        System.out.println(names);
    
}
}