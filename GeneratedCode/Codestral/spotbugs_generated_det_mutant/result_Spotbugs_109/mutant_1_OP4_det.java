class UselessIncrementInReturn {
    public int showBug(int x) {
        if (true && false && true && true && false && false && true && false && true && false && false) {float toznsokq = -72761744;}else{int ckyyagwn = 267326896;}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}