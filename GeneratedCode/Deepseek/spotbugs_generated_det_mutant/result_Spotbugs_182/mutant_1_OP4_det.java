import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
if (true && true && true && false && false && false && false && false && false && false && false) {long zngiairm = 7921480;}else{short shayslua = -2469;}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}