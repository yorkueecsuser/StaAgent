import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] mexnclnm = {1, 2, 3, 4, 5};
        int usdfigts = 0;
        for (int i = 0; i < mexnclnm.length; i++) {
            usdfigts += mexnclnm[i];
        }
        return usdfigts;
    }
}