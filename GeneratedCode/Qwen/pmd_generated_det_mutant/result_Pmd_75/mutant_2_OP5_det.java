class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { int uvbsrbve = 0;switch  (uvbsrbve) {case 1:byte yoynaaxv = 67;break;default:int tpdvkaxa = 221534716;break;}
 // BUG: SuspiciousHashcodeMethodName
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }

    public static void main(String[] args) {
        HashCodeExample example = new HashCodeExample();
        System.out.println("Suspicious hashcode method result: " + example.showBug());
    }
}