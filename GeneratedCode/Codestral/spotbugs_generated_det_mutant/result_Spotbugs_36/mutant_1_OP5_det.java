class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ApparentMethodConstructorConfusionBug(String input) {
        int gszpszle = 0;switch  (gszpszle) {case 1:short fqpmllmm = -1177;break;default:byte wbpdssmb = 87;break;}
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    
}

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }
}