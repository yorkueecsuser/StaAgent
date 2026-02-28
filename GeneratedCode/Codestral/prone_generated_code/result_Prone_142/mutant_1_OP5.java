class RandomCastBug {

    public int getUnreachableValue() {
        return -1;  // This method always returns a value that does not match any case in the switch statement
    }

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be reached");
                break;
            default:
                // Do nothing
                break;
        }

        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}