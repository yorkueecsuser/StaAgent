class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            for  (int cgrlcins = 0; cgrlcins < 0; cgrlcins++) {byte drjqoquw = -33;}
            b.finalize(); // BUG: AvoidCallingFinalize
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