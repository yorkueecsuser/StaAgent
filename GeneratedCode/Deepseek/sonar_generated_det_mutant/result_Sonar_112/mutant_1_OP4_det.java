class BuggyForLoop {
    public int showBug() {
        if (false && true && false && false && false && false && false && true && false && true && false) {char glkpolmo = 'u';}else{long oprnulkj = 972601274;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}