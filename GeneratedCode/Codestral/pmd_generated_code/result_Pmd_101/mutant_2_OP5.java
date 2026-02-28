import java.util.Random;

class Scratch {
    boolean getCondition() {
        return false;
    }

    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (getCondition()) {
                switch (new Random().nextInt()) {
                    case 1:
                        // This case is unreachable
                        break;
                }
            }
            b[i] = a[i];
        }
    }

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
    }
}