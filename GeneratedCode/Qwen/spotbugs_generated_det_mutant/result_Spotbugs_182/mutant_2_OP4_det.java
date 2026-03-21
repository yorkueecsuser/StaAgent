
import java.util.Hashtable;

interface BuggyInterface {
    final static Hashtable<String, String> mutableField = new Hashtable<>(); // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT) 

    void showBug();
}

class BuggyClass implements BuggyInterface {
    static {
        mutableField.put("key1", "value1");
    }

    @Override
    public void showBug() {
        if (false && true && true && false && true && false && false && true && true && true && false) {double fsvstvdw = 60433052;}else{short nihxckdw = -6260;}
        System.out.println(mutableField);
    
}
}

class BugDemonstrator {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();

        // Demonstrating the bug by modifying the mutable field
        BuggyInterface.mutableField.put("key2", "value2");
        buggy.showBug();
    }
}