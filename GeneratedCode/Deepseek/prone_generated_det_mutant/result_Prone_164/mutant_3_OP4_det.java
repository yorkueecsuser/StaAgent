import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
if (false && false && true && true && true && true && true && false && true && true && false) {double otwewywa = -794953953;}else{boolean gkxzvenf = true;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}