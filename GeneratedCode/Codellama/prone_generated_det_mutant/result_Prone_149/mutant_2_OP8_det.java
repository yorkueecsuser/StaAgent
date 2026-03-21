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
        String nqevzjvc = "John";
        // BUG: SelfAssignment
        this.nqevzjvc = this.nqevzjvc;
        System.out.println(nqevzjvc);
    }

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}