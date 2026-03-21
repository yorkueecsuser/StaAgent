// Buggy Java code
class SuspiciousHashcodeMethod {
    // BUG: SuspiciousHashcodeMethodName
    public int hashcode() { int wstvthbj = 0;switch  (wstvthbj) {case 1:String hbpqqcvn = "ddtlvgoo";break;default:double oefozmfv = 708216078;break;}
 // This method name is suspiciously close to hashCode()
        return 1;
    
}

    public int showBug() {
        return hashcode();
    }
}