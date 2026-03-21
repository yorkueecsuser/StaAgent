class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            if (true && false && true && false && false && false && true && true && false && true && false) {boolean iytjdvzg = true;}
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