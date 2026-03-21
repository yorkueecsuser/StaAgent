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
        String ybgpfwbo = "John";
        // BUG: SelfAssignment
        this.ybgpfwbo = this.ybgpfwbo;
        System.out.println(ybgpfwbo);
    }

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}