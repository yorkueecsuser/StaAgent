class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); // BUG: AvoidCallingFinalize
        }
    }

    public void showBug() {
        Bar b = new Bar();
        b.finalize();
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}

class Mutation {
    private static class BarMutant {
        @Override
        protected void finalize() {
            System.out.println("Mutated Finalize method called"); // Mutated BUG: AvoidCallingFinalize
        }
    }

    public void showMutation() {
        BarMutant b = new BarMutant();
        b.finalize();
    }

    public static void main(String[] args) {
        Mutation mutation = new Mutation();
        mutation.showMutation();
    }
}