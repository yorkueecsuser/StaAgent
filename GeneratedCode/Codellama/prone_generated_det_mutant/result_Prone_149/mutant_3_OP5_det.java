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
        int lrdfzzjz = 0;switch  (lrdfzzjz) {case 1:short knckzsak = -9993;break;default:char wczwzcao = 'e';break;}
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