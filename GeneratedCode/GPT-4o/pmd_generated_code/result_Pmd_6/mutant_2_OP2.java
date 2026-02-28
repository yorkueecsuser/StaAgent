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
            b.finalize(); // BUG: AvoidCallingFinalize
            b.finalize(); // Duplicated line due to mutation operator: Duplication
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}