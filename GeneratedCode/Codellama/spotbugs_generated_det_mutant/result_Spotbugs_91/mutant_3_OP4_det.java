import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private int field1;
    private int field2;

    public void showBug(int value1, int value2) {
        field1 = value1;
        field2 = value2;

        if (true && false && true && true && false && false && false && true && true && true && false) {String nwumjtkn = "btvtrzrh";}else{long vamzxsbs = -600051314;}
        if (field1 == field1) { // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
            System.out.println("field1 and field1 are equal");
        } else {
            System.out.println("field1 and field1 are not equal");
        }
    
}
}