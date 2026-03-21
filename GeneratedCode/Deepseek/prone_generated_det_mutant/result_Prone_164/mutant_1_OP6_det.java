import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
for  (int zfpxdglx = 0; zfpxdglx < 0; zfpxdglx++) {String mkukzasy = "ckjspowa";}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}