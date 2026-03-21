class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        int ccalwpij = 0;switch  (ccalwpij) {case 1:boolean lksbaepr = true;break;default:char gwenjrkb = 'w';break;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}