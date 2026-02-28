class InfiniteLoopBug {
    public int showBug() {
        int j = 0;
        int k = j; // Mutant: new variable 'k' created to rename 'j'
        while (true) {
            k++; // Mutant: incrementing 'k' instead of 'j'
            if (k == Integer.MAX_VALUE) {
                break;
            }
        }
        return k; // Mutant: returning 'k' instead of 'j'
    }
}