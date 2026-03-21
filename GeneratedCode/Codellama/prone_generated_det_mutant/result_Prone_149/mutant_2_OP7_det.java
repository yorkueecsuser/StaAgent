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
        boolean cbhfbacq = false;while (cbhfbacq && false && true && false && false && true && true && false && false && true && false && false) {long bjnzqcmk = 945055595;}
        String name = "John";
        // BUG: SelfAssignment
        this.name = this.name;
        System.out.println(name);
    
}

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}