class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            if (false && false && true && false && true && false && true && true && true && false && false) {boolean nstxplsg = true;}else{long okbahoxg = -655827241;}
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