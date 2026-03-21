class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { int selqqrgd = 0;switch  (selqqrgd) {case 1:String zrvdqone = "nvglroza";break;default:byte ptvspglc = 80;break;}
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