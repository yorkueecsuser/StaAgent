class RandomCastBug {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;
        // Inserted unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This line will never be executed.");
        }
        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}