class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            String r78nkvnx = "AvoidCallingFinalize"; // Mutant: AvoidCallingFinalize
            System.out.println("Finalize method called"); 
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