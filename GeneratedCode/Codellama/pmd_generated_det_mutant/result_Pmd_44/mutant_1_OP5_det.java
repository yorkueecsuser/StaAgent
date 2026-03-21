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
        int tqayccqp = 0;switch  (tqayccqp) {case 1:String epgptcjy = "jgkjyawo";break;default:byte eqegbnpa = -107;break;}
        super.finalize(); // BUG: FinalizeOnlyCallsSuperFinalize
    
}

    public static void main(String[] args) {
        FinalizeOnlyCallsSuperFinalize fo = new FinalizeOnlyCallsSuperFinalize("John", 30);
        System.out.println("Name: " + fo.name);
        System.out.println("Age: " + fo.age);
    }
}