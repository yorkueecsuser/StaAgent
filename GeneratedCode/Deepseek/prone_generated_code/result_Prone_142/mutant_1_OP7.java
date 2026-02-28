class RandomCastBug {
    public int showBug() {
        double rand = Math.random(); 
        int casted = (int) rand; 
        // BUG: RandomCast
        boolean condition = getCondition();
        while(condition) {
            break;
        }
        return casted; 
    }

    private boolean getCondition() {
        return false;
    }
}