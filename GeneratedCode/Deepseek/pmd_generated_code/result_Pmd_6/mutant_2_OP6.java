class DemoBug {
    private static class Bar {
        public void finalizeMethod() {
            System.out.println("Finalize method called"); // BUG: AvoidCallingFinalize
        }
    }

    public void showBug() {
        Bar b = new Bar();
        b.finalizeMethod();
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}