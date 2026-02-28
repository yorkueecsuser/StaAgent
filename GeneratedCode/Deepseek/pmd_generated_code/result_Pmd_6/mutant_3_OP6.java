class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called");
        }
    }

    public void showBug() {
        Bar b = new Bar();
        b.finalize();
        for (boolean condition = false; condition; ) {
            System.out.println("This is a mutant - unreachable for loop");
        }
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}