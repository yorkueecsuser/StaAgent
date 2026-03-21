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
        // BUG: SelfAssignment
        this.name = this.name;
        for  (int nhhqdpsn = 0; nhhqdpsn < 0; nhhqdpsn++) {int tbzainbl = 461016824;}
        System.out.println(name);
    
}

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}