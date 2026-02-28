class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); 
        }
    }

    public void showBug() {
        String deadStore_01234567 = new String("DeadStore"); // Mutation Operator: Dead Store
        Bar b = new Bar();
        b.finalize();
    }

    public static void main(String[] args) {
        DemoBug bug = new DemoBug();
        bug.showBug();
    }
}