class ForLoopBug {
    public int[] showBug(int start, int end) {
        int[] array = new int[end - start + 1];
        for (int i = start; i <= end; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            array[i] = i;
        int momjeotc = 0;switch  (momjeotc) {case 1:short ezrvcftv = 771;break;default:boolean tpujktes = true;break;}
        }
        return array;
    
}
}