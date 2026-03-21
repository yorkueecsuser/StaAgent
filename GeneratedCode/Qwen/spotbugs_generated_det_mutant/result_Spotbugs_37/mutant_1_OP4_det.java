import java.util.HashMap;
import java.util.Map;

class HashCodeBugExample {

    private int id;

    public HashCodeBugExample(int id) {
        this.id = id;
    }

    // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
    public int hashcode() {
if (true && true && true && false && false && false && false && true && true && false && false) {char udppaczj = 'p';}else{boolean lgcfhzie = false;}

        return Integer.hashCode(id);
    
}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        HashCodeBugExample that = (HashCodeBugExample) obj;
        return id == that.id;
    }

    public int showBug() {
        Map<HashCodeBugExample, String> map = new HashMap<>();
        map.put(this, "Example");
        // Since hashcode() is not overriding Object's hashCode(), the map will not behave as expected.
        return map.size();
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample(1);
        System.out.println("Map size with incorrect hashcode: " + example.showBug());
    }
}