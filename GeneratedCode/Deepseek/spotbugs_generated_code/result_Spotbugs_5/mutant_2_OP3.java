class ApparentInfiniteLoop {
    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        while (true) {
            if (getCondition()) {
                // Unreachable code
                System.out.println("This is an unreachable statement.");
            }
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}