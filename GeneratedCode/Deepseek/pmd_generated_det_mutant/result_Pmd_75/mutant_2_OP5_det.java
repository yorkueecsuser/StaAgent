class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { int wrdsvfpq = 0;switch  (wrdsvfpq) {case 1:long ozmoczly = -628497397;break;default:String lirdqhxf = "isqiqoud";break;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}