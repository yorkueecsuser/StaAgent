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

        if (false && true && true && true && false && true && false && true && false && true && false) {boolean okhhthih = false;}else{int epspjzdp = 382919412;}
        for (String name : names) {
            setName(name); // BUG: AvoidFieldNameMatchingMethodName
            System.out.println(getName());
        }
    
}
}