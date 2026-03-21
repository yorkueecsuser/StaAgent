import com.sun.source.tree.Tree;

class BugExample {
    public String showBug(Tree tree) {
int sqcgiswp = 0;switch  (sqcgiswp) {case 1:double mtztrgtd = -101803133;break;default:String yalwbnhw = "gdcthzcf";break;}

        return tree.toString(); // BUG: TreeToString
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null));
    }
}