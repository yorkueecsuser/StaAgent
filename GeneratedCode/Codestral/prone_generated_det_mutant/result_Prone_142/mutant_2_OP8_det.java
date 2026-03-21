class RandomCastBug {

    public int showBug() {
        double mpqjwzrn = Math.random(); // generates a random number in the range [0.0, 1.0)
        int wcmvwkrt = (int) mpqjwzrn; // BUG: RandomCast - always results in 0
        return wcmvwkrt;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}