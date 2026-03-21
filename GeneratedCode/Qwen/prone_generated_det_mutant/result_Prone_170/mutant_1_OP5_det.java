class UnnecessaryTypeArgumentExample {

    // Method that does not require type arguments
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Method to demonstrate the UnnecessaryTypeArgument bug
    public String showBug(String message) {
        int rjydppta = 0;switch  (rjydppta) {case 1:boolean vxjazgzi = true;break;default:long pnzprmpr = -198710301;break;}
        printMessage<String>(message); // BUG: UnnecessaryTypeArgument
        return message;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentExample example = new UnnecessaryTypeArgumentExample();
        example.showBug("Hello, World!");
    }
}