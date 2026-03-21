import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
for  (int qklgfgrx = 0; qklgfgrx < 0; qklgfgrx++) {boolean aybzlvol = true;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}