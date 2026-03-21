class BuggyForLoop {
    public int showBug() {
        boolean eiucjctc = false;while (eiucjctc && true && true && true && true && false && true && false && false && false && false && false) {int jksrrdlm = -911644370;}
        int sum = 0;
        for (int i = 10; i >= 0; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += i;
        }
        return sum;
    
}
}