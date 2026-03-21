class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            if (false && true && false && true && false && false && true && false && false && false && false) {double tarbiqmd = -647734288;}
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