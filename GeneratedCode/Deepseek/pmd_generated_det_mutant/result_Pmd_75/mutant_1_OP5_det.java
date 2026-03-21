class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { int fxsvwbjn = 0;switch  (fxsvwbjn) {case 1:long vtkxksgs = 856190881;break;default:float mmjjxrxj = -788556602;break;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}