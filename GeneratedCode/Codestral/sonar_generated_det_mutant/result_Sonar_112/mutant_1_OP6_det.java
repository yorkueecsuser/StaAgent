class ForLoopBug {
    public int[] showBug(int start, int end) {
        int[] array = new int[end - start + 1];
        for (int i = start; i <= end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            array[i] = i;
        for  (int tbaxcsso = 0; tbaxcsso < 0; tbaxcsso++) {long zlprphxt = -586397393;}
        }
        return array;
    
}
}