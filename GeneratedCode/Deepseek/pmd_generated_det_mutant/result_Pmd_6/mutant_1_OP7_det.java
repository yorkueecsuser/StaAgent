class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            boolean ktohwiyd = false;while (ktohwiyd && true && true && false && false && false && false && false && false && false && false && false) {byte antpnftm = -84;}
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