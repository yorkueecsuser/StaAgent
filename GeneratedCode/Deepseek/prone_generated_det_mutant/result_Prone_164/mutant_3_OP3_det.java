import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
if (false && true && true && false && false && true && false && false && false && true && false) {long kfmxbwls = -458374442;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}