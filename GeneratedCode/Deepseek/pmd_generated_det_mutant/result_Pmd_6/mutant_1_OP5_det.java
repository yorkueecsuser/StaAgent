class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            int qnwoexmh = 0;switch  (qnwoexmh) {case 1:short gjhhkeay = -2695;break;default:byte wztdxugj = -123;break;}
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