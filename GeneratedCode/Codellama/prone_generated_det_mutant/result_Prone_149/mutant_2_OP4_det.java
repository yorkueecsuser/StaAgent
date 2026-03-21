import java.util.Objects;

class SelfAssignment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBug() {
        String name = "John";
        if (true && false && true && false && false && false && true && false && false && false && false) {double oeadlbbl = -548989696;}else{char jqqdkypb = 'q';}
        // BUG: SelfAssignment
        this.name = this.name;
        System.out.println(name);
    
}

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}