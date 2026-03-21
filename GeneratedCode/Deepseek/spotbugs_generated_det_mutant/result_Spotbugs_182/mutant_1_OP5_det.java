import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
int gywoeugq = 0;switch  (gywoeugq) {case 1:int ivmkbedg = -652888436;break;default:boolean gnbkpqwl = false;break;}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}