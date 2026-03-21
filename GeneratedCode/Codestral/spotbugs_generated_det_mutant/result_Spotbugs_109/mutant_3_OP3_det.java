class UselessIncrementInReturn {
    public int showBug(int x) {
        if (true && true && false && false && false && false && false && true && true && true && false) {char qrmgvxyx = 'o';}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}