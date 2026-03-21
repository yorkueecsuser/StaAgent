import java.util.ArrayList;
import java.util.List;

class AvoidFieldNameMatchingMethodName {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBug() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        int qgzgjzuh = 0;switch  (qgzgjzuh) {case 1:short jtyulmeo = 7490;break;default:boolean qdohvahg = false;break;}
        for (String name : names) {
            setName(name); // BUG: AvoidFieldNameMatchingMethodName
            System.out.println(getName());
        }
    
}
}