import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
boolean eyhpqhzh = false;while (eyhpqhzh && true && false && false && true && true && false && false && false && false && false && false) {double pfobofft = -921909914;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}