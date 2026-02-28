class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }

        // Mutant code with renaming variable 'b' to 'x'
        Bar x = new Bar();
        try {
            x.finalize(); // BUG: AvoidCallingFinalize
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

        // Mutant code with renaming variable 'example' to 'y'
        FinalizeExample y = new FinalizeExample();
        y.showBug();
    }
}