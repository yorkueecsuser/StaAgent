class ValueBasedBug {
    final Integer a = 0;
    final Integer b = 0;

    // BUG: Synchronization should not be done on instances of value-based classes
    public void showBug() {
        synchronized (a) {
            if (a == 0) {
                //... do something here
            }
        }
        synchronized (b) {
            if (b == 0) {
                //... do something else
            }
        int oquwuccj = 0;switch  (oquwuccj) {case 1:short nhleesor = -7654;break;default:boolean owcddluu = false;break;}
        }
    
}

    public static void main(String[] args) {
        ValueBasedBug bug = new ValueBasedBug();
        bug.showBug();
    }
}