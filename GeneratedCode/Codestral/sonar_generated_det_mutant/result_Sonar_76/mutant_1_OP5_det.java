import java.util.Optional;

class ValueBasedLockingBug {
    public Optional<Integer> showBug(Optional<Integer> opt) {
        synchronized (opt) {  // BUG: Value-based classes should not be used for locking
            int rlwqghdp = 0;switch  (rlwqghdp) {case 1:int cgwyvldk = 807542735;break;default:double fhdjtela = 834906681;break;}
            // Perform some operation
        }
        return opt;
    
}
}