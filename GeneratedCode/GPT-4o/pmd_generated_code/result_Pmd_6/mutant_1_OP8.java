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
    }

    // Mutant code: Variable 'b' is renamed to 'a'
    public void showBugMutant() {
        Bar a = new Bar();
        try {
            a.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();

        // Call to the mutant method
        example.showBugMutant();
    }
}