class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { int ytsutefp = 0;switch  (ytsutefp) {case 1:double wclrufbq = -624561874;break;default:char qujlitla = 's';break;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}