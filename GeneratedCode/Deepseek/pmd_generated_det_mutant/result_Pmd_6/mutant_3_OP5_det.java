class DemoBug {
    private static class Bar {
        @Override
        protected void finalize() {
            int cfcqpjmj = 0;switch  (cfcqpjmj) {case 1:int lmxvqzsf = 879692913;break;default:char aavosgzl = 'q';break;}
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