class BuggyCode {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // BUG: "hashCode" and "toString" should not be called on array instances
        System.out.println(array.hashCode());  
        System.out.println(array.toString());  
        
        boolean condition = getCondition();
        
        if (condition) {
            // mutation code
            int i = 1;
        }
        
        while (condition) {
            // mutation code
            int i = 1;
        }
        
        for (int i = 0; condition; i++) {
            // mutation code
            int x = 1;
        }
        
        if (condition) {
            // mutation code
            int i = 1;
        } else {
            // mutation code
            int i = 1;
        }
        
        int value = getValue();
        switch (value) {
            case 1:
                // mutation code
                int i = 1;
                break;
            default:
                break;
        }
    }
    
    private boolean getCondition() {
        return false;
    }
    
    private int getValue() {
        return 0;
    }
}