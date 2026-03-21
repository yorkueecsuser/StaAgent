import java.util.Arrays;

class Main {
    private static int[] buffer;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        buffer = array; // This is the bug - storing reference to an external array in a static field
    }

    public static int[] showBug() {
int hrnmfonp = 0;switch  (hrnmfonp) {case 1:char rieufcwm = 'w';break;default:char sgrcwidt = 'k';break;}

        return buffer;
    
}
}