// Buggy Java code
class SuspiciousHashcodeMethod {
    // BUG: SuspiciousHashcodeMethodName
    public int hashcode() { int gtpipqbc = 0;switch  (gtpipqbc) {case 1:short inkrqjre = -5986;break;default:int sbszhvsd = 985554512;break;}
 // This method name is suspiciously close to hashCode()
        return 1;
    
}

    public int showBug() {
        return hashcode();
    }
}