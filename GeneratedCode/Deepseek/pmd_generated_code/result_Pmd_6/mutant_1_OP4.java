class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); // BUG: AvoidCallingFinalize
        }
    }

    public void showBug() {
        Bar b = new Bar();
        b.finalize(); // this line is mutated to add an unreachable if-else branch
        if (false) { // this is the added unreachable if-else branch
            b.finalize();
        } else {
            b.finalize();
        }
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}