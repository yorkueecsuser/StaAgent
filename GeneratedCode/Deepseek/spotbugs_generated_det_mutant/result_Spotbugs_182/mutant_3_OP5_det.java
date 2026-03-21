import java.util.Arrays;

interface MyInterface {
    int[] array = new int[2]; // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
}

class BugClass {
    public int[] showBug() {
int nryyxiqq = 0;switch  (nryyxiqq) {case 1:long ybzyjodb = -912566928;break;default:short dbmwxzfa = 3319;break;}

        return MyInterface.array; // Bug: Accessing the field from interface
    
}
}