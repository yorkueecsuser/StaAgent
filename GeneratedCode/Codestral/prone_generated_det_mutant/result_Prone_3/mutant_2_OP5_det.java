import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        int iugxhctq = 0;switch  (iugxhctq) {case 1:char opuvigez = 'q';break;default:short ilgrmmkm = 1457;break;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]
    
}

    public static void main(String[] args) {
        showBug();
    }
}