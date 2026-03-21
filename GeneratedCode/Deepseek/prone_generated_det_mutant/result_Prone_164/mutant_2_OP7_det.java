import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
boolean ujhkjuob = false;while (ujhkjuob && true && true && false && false && false && true && false && false && true && true && false) {short rfmlrtnf = 970;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}