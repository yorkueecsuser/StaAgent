import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
float ymsjunpj = -839111232;

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}