import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
int upgjznqb = 0;switch  (upgjznqb) {case 1:String grchcqns = "txlsupzg";break;default:short lsbqoyhy = -8501;break;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}