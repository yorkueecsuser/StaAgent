import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
if (true && false && true && true && true && true && true && true && true && true && false) {boolean ypkgnssz = true;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}