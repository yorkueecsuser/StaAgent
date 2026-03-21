class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        int ijxmqkjq = 0;switch  (ijxmqkjq) {case 1:long sixtcfvk = -292788916;break;default:int bfiplmuu = 502258266;break;}
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    
}

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}