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
        int vxbmrqqu = 0;switch  (vxbmrqqu) {case 1:char wmnuqhtt = 'b';break;default:boolean thugsvsd = true;break;}
        }
    
}

    public static void main(String[] args) {
        ValueBasedBug bug = new ValueBasedBug();
        bug.showBug();
    }
}