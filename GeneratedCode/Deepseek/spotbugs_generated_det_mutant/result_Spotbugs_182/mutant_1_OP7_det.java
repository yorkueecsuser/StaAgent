import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
boolean kloivwdv = false;while (kloivwdv && false && true && false && true && true && false && false && true && true && false && false) {String ohvnmkxq = "whhofsqd";}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}