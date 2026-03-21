class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            boolean remppzbe = false;while (remppzbe && true && true && true && false && false && false && false && true && true && false && false) {double zcykgmat = -703207413;}
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