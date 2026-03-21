class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { int zjmwejbn = 0;switch  (zjmwejbn) {case 1:long vmlrcold = 949379095;break;default:String izcnqdqr = "mrwquzgo";break;}
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