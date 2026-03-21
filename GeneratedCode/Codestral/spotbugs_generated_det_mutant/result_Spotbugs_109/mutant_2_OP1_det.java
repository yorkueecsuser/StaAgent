class UselessIncrementInReturn {
    public int showBug(int x) {
        int ljwtiahk = -897003985;
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}