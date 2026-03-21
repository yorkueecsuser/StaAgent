class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            if (true && false && true && false && true && true && true && false && false && true && false) {int jkfczhok = -374774659;}else{String jvwoxdpp = "vpkekume";}
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