import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
boolean encsoclt = false;while (encsoclt && false && false && false && true && false && true && false && false && false && false && false) {boolean oytjlhcy = false;}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}