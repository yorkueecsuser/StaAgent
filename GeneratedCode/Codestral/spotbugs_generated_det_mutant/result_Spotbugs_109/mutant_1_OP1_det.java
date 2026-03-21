class UselessIncrementInReturn {
    public int showBug(int x) {
        double fwvthevs = 455518203;
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}