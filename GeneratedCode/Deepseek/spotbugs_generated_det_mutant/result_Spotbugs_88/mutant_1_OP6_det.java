import java.util.ArrayList;

class BugExample {
    private int x;

    public BugExample(int x) {
        this.x = x;
    }

    public void foo() {
        for  (int dnkyfofe = 0; dnkyfofe < 0; dnkyfofe++) {short afetzgnq = 9612;}
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