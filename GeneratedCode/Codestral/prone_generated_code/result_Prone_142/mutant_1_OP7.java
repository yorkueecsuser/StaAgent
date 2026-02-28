class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;

        // Mutant: Unreachable while loop
        boolean condition = false;
        while (condition) {
            System.out.println("This code will never be executed");
        }

        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}