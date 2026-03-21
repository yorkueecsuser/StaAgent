class UselessIncrementInReturn {
    public int showBug(int x) {
        for  (int hocpwont = 0; hocpwont < 0; hocpwont++) {int hcscrwch = 505297285;}
        // Bug: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        return x++;
    
}
}