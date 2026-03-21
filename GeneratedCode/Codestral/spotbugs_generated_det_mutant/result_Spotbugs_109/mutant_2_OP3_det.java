class UselessIncrementInReturn {
    public int showBug(int x) {
        if (false && true && true && false && true && false && true && false && false && false && false) {short gjcuzdxx = -9541;}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}