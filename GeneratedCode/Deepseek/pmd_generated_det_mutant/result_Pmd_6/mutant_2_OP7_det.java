class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            boolean wehgxnno = false;while (wehgxnno && false && false && true && true && false && true && true && false && true && false && false) {char sumnlhlj = 'z';}
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