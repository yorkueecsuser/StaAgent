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

        for (String name : names) {
            setName(name); // BUG: AvoidFieldNameMatchingMethodName
            if (false && false && true && false && true && true && false && true && false && false && false) {short japksbaz = -7957;}else{boolean wpgvmpmk = true;}
            System.out.println(getName());
        }
    
}
}