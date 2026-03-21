class ValueBasedBug {
    final Integer a = 0;
    final Integer b = 0;

    // BUG: Synchronization should not be done on instances of value-based classes
    public void showBug() {
        synchronized (a) {
            if (a == 0) {
                //... do something here
            }
        int ejydqnuo = 0;switch  (ejydqnuo) {case 1:boolean lodmcvbr = false;break;default:boolean wjtbseqf = false;break;}
        }
        synchronized (b) {
            if (b == 0) {
                //... do something else
            }
        }
    
}

    public static void main(String[] args) {
        ValueBasedBug bug = new ValueBasedBug();
        bug.showBug();
    }
}