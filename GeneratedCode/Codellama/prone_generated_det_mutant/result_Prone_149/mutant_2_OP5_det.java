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
        int afbwkocj = 0;switch  (afbwkocj) {case 1:char gtdmpprt = 'v';break;default:boolean echxrdpn = true;break;}
        System.out.println(name);
    
}

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}