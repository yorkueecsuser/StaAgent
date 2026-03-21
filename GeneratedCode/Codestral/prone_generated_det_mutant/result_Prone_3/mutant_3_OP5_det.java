import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        int ngluymgt = 0;switch  (ngluymgt) {case 1:String aazswvyp = "wgoeowlf";break;default:short sshaohpk = -6579;break;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}