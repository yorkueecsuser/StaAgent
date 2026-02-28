import java.util.*;

class BuggyStringBuffer {
    public int showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb = new StringBuffer('c');

        // Dead Store Mutation Operator
        int unusedVariable = 10; // insert a dead store

        return sb.capacity();
    }
}