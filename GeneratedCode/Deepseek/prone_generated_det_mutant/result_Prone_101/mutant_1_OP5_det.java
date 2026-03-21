class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        int gqqilyns = 0;switch  (gqqilyns) {case 1:boolean eeebhuic = true;break;default:byte fnwckohu = -104;break;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}