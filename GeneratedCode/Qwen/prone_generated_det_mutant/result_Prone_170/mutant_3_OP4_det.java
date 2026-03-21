class UnnecessaryTypeArgumentExample {

    // Method that does not require type arguments
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Method to demonstrate the UnnecessaryTypeArgument bug
    public String showBug(String message) {
        if (false && true && false && true && false && false && true && true && true && false && false) {float janquzok = 53012784;}else{short jevbrigy = -4595;}
        printMessage<String>(message); // BUG: UnnecessaryTypeArgument
        return message;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentExample example = new UnnecessaryTypeArgumentExample();
        example.showBug("Hello, World!");
    }
}