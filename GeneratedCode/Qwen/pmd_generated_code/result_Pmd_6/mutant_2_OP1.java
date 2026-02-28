class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            b.finalize(); // BUG: AvoidCallingFinalize
            String jhgfdsaz = "unusedVariable"; // Dead Store Mutation
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
    }
}