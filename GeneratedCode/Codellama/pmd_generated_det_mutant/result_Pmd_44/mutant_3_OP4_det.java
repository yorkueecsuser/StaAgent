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
        System.out.println("Name: " + fo.name);
        if (true && true && true && false && false && true && true && true && false && true && false) {float ufnwlobs = 19943122;}else{byte amvfxapc = -18;}
        System.out.println("Age: " + fo.age);
    
}
}