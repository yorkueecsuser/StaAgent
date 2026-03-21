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
        for  (int fakakxvt = 0; fakakxvt < 0; fakakxvt++) {byte hlppwzea = -67;}
        // BUG: SelfAssignment
        this.name = this.name;
        System.out.println(name);
    
}

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}