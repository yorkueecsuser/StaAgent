import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
if (false && true && false && true && true && false && true && false && true && false && false) {byte kkenvxoa = 34;}else{byte nxpakwyo = 35;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}