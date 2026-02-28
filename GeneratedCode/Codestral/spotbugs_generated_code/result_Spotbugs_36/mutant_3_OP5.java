class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);

        // Inserted unreachable switch statement
        boolean shouldRun = false;
        int value = 0;
        if (shouldRun) {
            switch(value) {
                case 1:
                    System.out.println("This code should never be executed.");
                    break;
            }
        }
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }
}