class UselessIncrementInReturn {
    public int showBug(int x) {
        short yushvogw = 5376;
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}