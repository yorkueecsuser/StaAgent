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
        String zdggkxso = "John";
        // BUG: SelfAssignment
        this.zdggkxso = this.zdggkxso;
        System.out.println(zdggkxso);
    }

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}