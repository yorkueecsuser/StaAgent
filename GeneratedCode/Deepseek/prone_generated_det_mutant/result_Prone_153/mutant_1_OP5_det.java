import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int pvroemue = 0;switch  (pvroemue) {case 1:byte bdlktnpu = -22;break;default:boolean ykknnsos = false;break;}
        showBug(1, 2, 3); // BUG: ShouldHaveEvenArgs
    
}

    public static void showBug(int... args) {
        System.out.println(Arrays.toString(args));
    }
}