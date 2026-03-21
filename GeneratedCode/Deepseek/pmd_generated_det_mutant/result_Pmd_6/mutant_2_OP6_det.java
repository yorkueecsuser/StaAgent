class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            for  (int buuqfmqq = 0; buuqfmqq < 0; buuqfmqq++) {double wiaflrpe = 685061737;}
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