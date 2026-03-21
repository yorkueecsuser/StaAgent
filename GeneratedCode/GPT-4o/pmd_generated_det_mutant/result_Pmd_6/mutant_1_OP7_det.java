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
            boolean eyewqxit = false;while (eyewqxit && false && false && true && false && true && false && true && false && true && true && false) {short dohoknan = 3245;}
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable t) {
            t.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}