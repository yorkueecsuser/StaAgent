class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); // BUG: AvoidCallingFinalize
        }
    }

    public void showBug() {
        Bar b = new Bar();
        while(false) {
            b.finalize();
        }
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}