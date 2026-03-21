class Scratch {
    void copy_a_to_b(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int bxspgcjh = 0;switch  (bxspgcjh) {case 1:char wxvdymwu = 'f';break;default:char rwxbwptw = 's';break;}
            b[i] = a[i];  // BUG: AvoidArrayLoops
        }
    
}

    void showBug() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        copy_a_to_b(a, b);
        // Now b should be a copy of a, but it's not efficiently done
    }
}