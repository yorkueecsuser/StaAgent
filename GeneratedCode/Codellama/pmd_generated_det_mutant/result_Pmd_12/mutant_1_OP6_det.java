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
        for  (int urcumifa = 0; urcumifa < 0; urcumifa++) {boolean ptkcyigp = false;}
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            setName(name); // BUG: AvoidFieldNameMatchingMethodName
            System.out.println(getName());
        }
    
}
}