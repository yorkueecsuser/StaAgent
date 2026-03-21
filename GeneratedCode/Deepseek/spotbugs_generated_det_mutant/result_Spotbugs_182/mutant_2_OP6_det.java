import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
for  (int xerzhvyc = 0; xerzhvyc < 0; xerzhvyc++) {int xtilpchs = 960531332;}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}