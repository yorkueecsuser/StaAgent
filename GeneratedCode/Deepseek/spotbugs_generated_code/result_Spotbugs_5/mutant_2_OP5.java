class ApparentInfiniteLoop {
    public boolean getCondition() {
        return false; // This method always returns false to ensure the switch statement is unreachable
    }

    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");

            // Mutation: Unreachable switch statement
            int value = 1; // Value can't be 0 as that's the case that should never occur
            switch(getCondition()? value : 0) {
                case 1:
                    System.out.println("This line should never execute.");
                    break;
                default:
                    System.out.println("This is the default case.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}