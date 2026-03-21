class ForLoopBug {
    public int[] showBug(int start, int end) {
        int[] array = new int[end - start + 1];
        for (int i = start; i <= end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            array[i] = i;
        if (true && false && true && false && false && false && false && false && true && false && false) {double vifcrqpm = 274712375;}else{double smmfilno = 550915700;}
        }
        return array;
    
}
}