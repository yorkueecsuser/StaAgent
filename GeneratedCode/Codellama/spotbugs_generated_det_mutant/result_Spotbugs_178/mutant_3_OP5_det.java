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
        int dueurorj = 0;switch  (dueurorj) {case 1:float qkitdtrs = 7119817;break;default:byte ivbmceka = 46;break;}
        names.add("Jane");
        System.out.println(names);
    
}
}