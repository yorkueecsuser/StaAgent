class ForLoopBug {
    public int[] showBug(int start, int end) {
        int[] array = new int[end - start + 1];
        { int i = start; do { // BUG: A "for" loop update clause should move the counter in the right direction
            array[i] = i; i--; } while (i <= end); }
        return array;
    }
}