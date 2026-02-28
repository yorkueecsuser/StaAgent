class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            System.out.println("Finalize method called"); 
            int value = 1; // Unreachable switch statement mutant
            switch (value) {
                case 0:
                    System.out.println("Unreachable statement");
                    break;
                default:
                    break;
            }
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