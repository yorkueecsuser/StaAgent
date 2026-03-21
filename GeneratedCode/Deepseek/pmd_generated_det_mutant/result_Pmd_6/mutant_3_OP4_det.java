class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            if (false && false && false && true && true && true && true && false && true && true && false) {short pwwmxjxh = -7508;}else{long fujvhfxk = -90909515;}
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