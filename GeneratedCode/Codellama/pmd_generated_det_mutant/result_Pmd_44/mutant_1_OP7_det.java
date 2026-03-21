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
        boolean bohjdbow = false;while (bohjdbow && false && true && false && false && true && true && true && false && false && false && false) {float dlizdoqi = -473928761;}
        System.out.println("Name: " + fo.name);
        System.out.println("Age: " + fo.age);
    
}
}