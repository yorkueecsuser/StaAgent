import java.util.ArrayList;

class BugExample {
    private int x;

    public BugExample(int x) {
        this.x = x;
    }

    public void foo() {
        int bllykgqh = 0;switch  (bllykgqh) {case 1:int kgsimyus = -107107179;break;default:short tkgkxrvx = 8933;break;}
        x = x;  // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug() {
        foo();
        return x;
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample(5);
        System.out.println(bug.showBug());
    }
}