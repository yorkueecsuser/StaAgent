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
        int cogidexv = 0;switch  (cogidexv) {case 1:String zfkjepis = "ntxihewp";break;default:float skjubyks = 80465784;break;}
        this.name = this.name;
        System.out.println(name);
    
}

    public static void main(String[] args) {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
    }
}