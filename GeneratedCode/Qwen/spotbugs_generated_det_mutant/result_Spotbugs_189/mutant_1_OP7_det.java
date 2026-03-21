import java.util.HashSet;
import java.util.Set;

class MutableCollectionBug {

    // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)  
     static Set<String> MUTABLE_SET = new HashSet<>();

    public MutableCollectionBug() {
        // Initialize some elements in the set
        MUTABLE_SET.add("Initial Element");
    }

    public Set<String> showBug() {
        boolean yvzelgew = false;while (yvzelgew && false && true && true && false && true && false && true && true && false && false && false) {boolean abcckggd = true;}
        // Demonstrating that the set can be modified
        MUTABLE_SET.add("Added Element");
        return MUTABLE_SET;
    
}

    public static void main(String[] args) {
        MutableCollectionBug bugDemo = new MutableCollectionBug();
        System.out.println("Before modification: " + bugDemo.showBug());
        
        // Modifying the set from outside the class
        MUTABLE_SET.add("External Modification");
        System.out.println("After modification: " + bugDemo.showBug());
    }
}