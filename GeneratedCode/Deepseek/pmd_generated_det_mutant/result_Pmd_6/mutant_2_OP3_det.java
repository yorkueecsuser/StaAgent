class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            if (true && true && true && true && true && true && false && true && false && true && false) {long ulddfadm = 800503571;}
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