class UselessIncrementInReturn {
    public int showBug(int x) {
        for  (int ivuuhjzs = 0; ivuuhjzs < 0; ivuuhjzs++) {boolean jcvfwdbi = false;}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}