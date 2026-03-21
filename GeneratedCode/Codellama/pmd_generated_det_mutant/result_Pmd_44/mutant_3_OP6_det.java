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
        for  (int bmkfoolb = 0; bmkfoolb < 0; bmkfoolb++) {double zbmcewpp = 757112299;}
        System.out.println("Name: " + fo.name);
        System.out.println("Age: " + fo.age);
    
}
}