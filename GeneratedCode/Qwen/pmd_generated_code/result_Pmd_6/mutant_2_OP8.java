class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        Bar c = new Bar(); // Added mutant variable
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
            c.finalize(); // Mutant: Calling finalize on a different variable
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static class Bar {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalizing Bar object");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
        FinalizeExample example2 = new FinalizeExample(); // Added mutant variable
        example2.showBug(); // Mutant: Calling showBug on a different variable
    }
}