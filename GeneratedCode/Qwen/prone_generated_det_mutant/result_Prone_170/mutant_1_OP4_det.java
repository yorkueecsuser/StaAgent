class UnnecessaryTypeArgumentExample {

    // Method that does not require type arguments
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Method to demonstrate the UnnecessaryTypeArgument bug
    public String showBug(String message) {
        if (true && true && false && false && true && true && true && false && true && true && false) {boolean qivxfizt = true;}else{boolean fdjpbwjl = true;}
        printMessage<String>(message); // BUG: UnnecessaryTypeArgument
        return message;
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgumentExample example = new UnnecessaryTypeArgumentExample();
        example.showBug("Hello, World!");
    }
}