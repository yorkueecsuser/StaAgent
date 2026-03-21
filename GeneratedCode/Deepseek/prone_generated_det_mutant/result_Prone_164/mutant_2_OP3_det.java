import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
if (false && false && false && true && false && false && true && false && true && false && false) {String hwvqdnuk = "hjqodcco";}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}