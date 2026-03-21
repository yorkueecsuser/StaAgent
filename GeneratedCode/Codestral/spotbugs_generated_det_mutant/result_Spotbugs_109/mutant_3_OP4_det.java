class UselessIncrementInReturn {
    public int showBug(int x) {
        if (false && true && true && true && true && false && true && false && true && true && false) {double hqfmvvhp = 863427013;}else{long dxtgbhtm = -66402771;}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}