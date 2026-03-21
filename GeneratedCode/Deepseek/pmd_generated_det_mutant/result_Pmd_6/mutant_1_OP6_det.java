class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            for  (int uyszdcpa = 0; uyszdcpa < 0; uyszdcpa++) {boolean evhzkdbz = false;}
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