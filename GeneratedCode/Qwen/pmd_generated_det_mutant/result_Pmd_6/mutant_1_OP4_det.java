class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            if (false && false && true && false && true && true && false && false && true && true && false) {byte cdcvgyva = 50;}else{char jztocvbf = 'n';}
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