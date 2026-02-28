class ApparentInfiniteLoop {
    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }

    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)

            // Mutant code - Unreachable switch statement
            if (getCondition()) {
                int value = getValue();
                switch(value) {
                    case 1:
                        System.out.println("This is an unreachable switch statement.");
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}