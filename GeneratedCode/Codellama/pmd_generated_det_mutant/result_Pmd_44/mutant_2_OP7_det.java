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
        boolean cdgthntp = false;while (cdgthntp && true && true && false && true && false && false && false && false && true && true && false) {float tdelokey = -620135566;}
        FinalizeOnlyCallsSuperFinalize fo = new FinalizeOnlyCallsSuperFinalize("John", 30);
        System.out.println("Name: " + fo.name);
        System.out.println("Age: " + fo.age);
    
}
}