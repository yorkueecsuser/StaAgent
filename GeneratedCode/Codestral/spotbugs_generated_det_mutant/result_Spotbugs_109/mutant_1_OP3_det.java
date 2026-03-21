class UselessIncrementInReturn {
    public int showBug(int x) {
        if (true && false && true && true && false && false && true && false && true && true && false) {float dypuscge = -102892941;}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}