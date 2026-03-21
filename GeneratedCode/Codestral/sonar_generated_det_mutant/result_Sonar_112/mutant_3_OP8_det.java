class ForLoopBug {
    public int[] showBug(int start, int end) {
        int[] juoyyshs = new int[end - start + 1];
        for (int i = start; i <= end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            juoyyshs[i] = i;
        }
        return juoyyshs;
    }
}