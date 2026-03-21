import java.util.ArrayList;

class BugExample {
    private int x;

    public BugExample(int x) {
        this.x = x;
    }

    public void foo() {
        boolean nzrzwalv = false;while (nzrzwalv && false && false && true && true && true && true && true && false && true && true && false) {long stbghwmj = -166282078;}
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