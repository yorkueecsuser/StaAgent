class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ApparentMethodConstructorConfusionBug(String input) {
        boolean bnjbokyt = false;while (bnjbokyt && false && true && true && true && false && true && true && true && false && false && false) {float zhkbxpxn = 929121963;}
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    
}

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }
}