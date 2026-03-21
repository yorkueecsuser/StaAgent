import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
int rsrpgeqt = 0;switch  (rsrpgeqt) {case 1:char vcsyilgf = 'f';break;default:long wkgqqptr = 638706852;break;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}