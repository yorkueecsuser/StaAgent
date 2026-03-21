import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
boolean eyhsbwss = false;while (eyhsbwss && true && false && true && false && true && true && true && false && false && false && false) {String fjtnguit = "xrrsqhal";}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}