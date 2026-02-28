class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b_mutant = new Bar();
        try {
            b_mutant.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e_mutant) {
            e_mutant.printStackTrace();
        }
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}