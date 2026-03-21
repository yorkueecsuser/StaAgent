class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            int viovoetu = 0;switch  (viovoetu) {case 1:long msggosgy = 370770426;break;default:char tkkwrrbq = 'n';break;}
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