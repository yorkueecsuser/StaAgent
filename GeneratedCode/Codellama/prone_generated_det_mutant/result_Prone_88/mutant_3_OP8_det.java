import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] ixymuegy = {1, 2, 3, 4, 5};
        int rurqecbf = 0;
        for (int i = 0; i < ixymuegy.length; i++) {
            rurqecbf += ixymuegy[i];
        }
        return rurqecbf;
    }
}