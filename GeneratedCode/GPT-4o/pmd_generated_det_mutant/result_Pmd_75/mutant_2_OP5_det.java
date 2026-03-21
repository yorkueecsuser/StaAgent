class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { int csaxloog = 0;switch  (csaxloog) {case 1:byte uhknaznu = 52;break;default:char eddufdnn = 'l';break;}
 // BUG: SuspiciousHashcodeMethodName
        return 42;
    
}

    // Method to demonstrate the bug
    public int showBug() {
        return hashcode();
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}