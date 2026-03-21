class BoxedPrimitiveLockBug {
    private final Integer lock = 42;

    public void showBug() {
        int szoewyhn = 0;switch  (szoewyhn) {case 1:long ktkuhnrk = 89871393;break;default:long kjbvkxkl = -7642867;break;}
        synchronized (lock) { // BUG: LockOnBoxedPrimitive
            //...
        }
    
}
}