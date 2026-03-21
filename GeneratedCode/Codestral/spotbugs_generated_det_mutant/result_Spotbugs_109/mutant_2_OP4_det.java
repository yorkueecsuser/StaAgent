class UselessIncrementInReturn {
    public int showBug(int x) {
        if (false && false && true && false && false && false && true && false && true && false && false) {char gmexqixz = 't';}else{char zdjxbonw = 'j';}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}