import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        int ofxlmnvi = 0;switch  (ofxlmnvi) {case 1:boolean srtsozxw = false;break;default:float ahgapqcs = 726116889;break;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}