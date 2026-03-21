class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            boolean rtweqkfw = false;while (rtweqkfw && false && true && false && false && false && true && true && false && false && false && false) {int xjshhfsl = 488326048;}
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