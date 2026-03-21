class UselessIncrementInReturn {
    public int showBug(int x) {
        for  (int ysmoaecc = 0; ysmoaecc < 0; ysmoaecc++) {boolean hhxkucwk = true;}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}