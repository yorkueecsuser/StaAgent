class FinalizeBugExample {

    static class Bar {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Bar's finalize method called.");
        }
    }

    public void showBug() {
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable t) {
            t.printStackTrace();
        }

        // Adding unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the else block.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}