import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
for  (int dzfluyvi = 0; dzfluyvi < 0; dzfluyvi++) {long bsezkurw = -49853528;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}