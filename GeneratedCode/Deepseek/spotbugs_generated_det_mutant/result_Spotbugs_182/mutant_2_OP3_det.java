import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
if (true && false && false && false && false && true && false && true && false && false && false) {String bldgsjwp = "ldimwauo";}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}