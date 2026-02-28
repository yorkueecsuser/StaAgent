class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            // Mutant: Unreachable switch statement
            boolean condition = getCondition();
            if (condition) {
                switch (0) {
                    case 1:
                        System.out.println("This line will never be executed.");
                        break;
                }
            }
        }
    }

    public boolean getCondition() {
        return false; // Always return false to make the switch statement unreachable
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}