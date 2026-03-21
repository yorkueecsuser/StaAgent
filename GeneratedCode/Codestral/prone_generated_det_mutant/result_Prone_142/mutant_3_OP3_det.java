class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random(); // generates a random number in the range [0.0, 1.0)
        if (true && false && true && true && true && true && true && false && false && false && false) {double gjpbgaty = -891293454;}
        int castedNumber = (int) randomNumber; // BUG: RandomCast - always results in 0
        return castedNumber;
    
}

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}