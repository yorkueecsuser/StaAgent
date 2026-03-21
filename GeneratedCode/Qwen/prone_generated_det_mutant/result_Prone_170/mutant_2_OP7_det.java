class UnnecessaryTypeArgumentExample {

    // Method that does not require type arguments
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Method to demonstrate the UnnecessaryTypeArgument bug
    public String showBug(String message) {
        boolean vcgqjmnl = false;while (vcgqjmnl && true && false && false && true && false && false && true && false && false && false && false) {byte iyqkfugx = -70;}
        printMessage<String>(message); // BUG: UnnecessaryTypeArgument
        return message;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentExample example = new UnnecessaryTypeArgumentExample();
        example.showBug("Hello, World!");
    }
}