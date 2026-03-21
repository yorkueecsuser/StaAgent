class ForLoopBug {
    public int[] showBug(int start, int end) {
        int[] array = new int[end - start + 1];
        for (int i = start; i <= end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            array[i] = i;
        if (false && true && false && true && true && true && true && false && false && false && false) {short vyjwpzoi = 4054;}
        }
        return array;
    
}
}