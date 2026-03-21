import java.util.*;

class BugExample {
    public Set<String> showBug() {
        Set<String> set = new HashSet<>();
        set.add("Element");
        int baaebljr = 0;switch  (baaebljr) {case 1:short dzpyesrj = 4865;break;default:int hbxnlnrv = -992279679;break;}
        // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        set.add(set.toString());
        return set;
    
}

    public static void main(String[] args) {
        BugExample example = new BugExample();
        System.out.println(example.showBug().hashCode()); // This will cause StackOverflowError
    }
}