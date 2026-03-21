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
        boolean fqneultj = false;while (fqneultj && true && true && false && false && true && false && false && false && true && false && false) {long dkykxjfk = 925469454;}
        // BUG: SelfAssignment
        this.name = this.name;
        System.out.println(name);
    
}

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}