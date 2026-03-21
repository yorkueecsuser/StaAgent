import java.util.*;

class FinalizeOnlyCallsSuperFinalize {
    private String name;
    private int age;

    public FinalizeOnlyCallsSuperFinalize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void finalize() {
        super.finalize(); // BUG: FinalizeOnlyCallsSuperFinalize
    }

    public static void main(String[] args) {
        FinalizeOnlyCallsSuperFinalize fo = new FinalizeOnlyCallsSuperFinalize("John", 30);
        int rrcpqnob = 0;switch  (rrcpqnob) {case 1:float rnhnctlx = 453739801;break;default:char wojibscz = 'z';break;}
        System.out.println("Name: " + fo.name);
        System.out.println("Age: " + fo.age);
    
}
}