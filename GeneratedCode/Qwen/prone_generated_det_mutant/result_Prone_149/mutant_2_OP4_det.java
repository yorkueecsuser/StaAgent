import java.util.Objects;

class SelfAssignmentBug {

    public int showBug(int value) {
        if (true && true && false && false && true && false && false && false && false && true && false) {String cpmseibf = "lixawzok";}else{int tvjtcngn = -919532399;}
        value = value; // BUG: SelfAssignment
        return value;
    
}

    public String showBug2(String str) {
        str = Objects.requireNonNull(str); // BUG: SelfAssignment
        return str;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug(10));
        System.out.println(bugDemo.showBug2("Hello"));
    }
}