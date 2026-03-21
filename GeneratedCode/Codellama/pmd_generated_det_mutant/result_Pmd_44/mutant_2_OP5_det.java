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
        int vbesowni = 0;switch  (vbesowni) {case 1:long ljyzyfch = 137222308;break;default:byte iovwcjtp = 84;break;}
        System.out.println("Name: " + fo.name);
        System.out.println("Age: " + fo.age);
    
}
}