class ForLoopBug {
    public int[] showBug(int start, int end) {
        int[] array = new int[end - start + 1];
        for (int i = start; i <= end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            array[i] = i;
        if (true && true && false && false && false && true && false && false && true && true && false) {int yprhxeng = 201415452;}else{int kwatfhnp = 948728074;}
        }
        return array;
    
}
}