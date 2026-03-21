class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            boolean kxkzirgx = false;while (kxkzirgx && false && false && true && false && false && true && false && false && true && false && false) {float enfsymcs = 920205448;}
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