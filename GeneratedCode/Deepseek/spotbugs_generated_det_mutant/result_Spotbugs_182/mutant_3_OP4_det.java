import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
if (false && false && false && true && true && true && true && true && true && true && false) {float zdzklrzl = 156617440;}else{int jclqjzrw = -917441086;}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}