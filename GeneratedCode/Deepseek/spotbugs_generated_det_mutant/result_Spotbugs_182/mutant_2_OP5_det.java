import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
int zewdezib = 0;switch  (zewdezib) {case 1:long thjhzxar = 965405449;break;default:short aqjdicsb = -5466;break;}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}