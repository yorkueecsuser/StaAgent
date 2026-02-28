class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".","");
        return clean;
    }

    public String showBug2(String str) {
        String clean = str.replaceAll("|","_");
        return clean;
    }

    public String showBug3(String str) {
        String clean = str.replaceAll(java.io.File.separator,"");
        return clean;
    }

    // New method with unreachable switch statement
    public void unreachableSwitch() {
        boolean condition = getCondition();
        if (condition) {
            // Intentionally leaving this block empty to make the switch statement unreachable
        } else {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("This will never print");
                    break;
            }
        }
    }

    // Helper method to return a constant false
    private boolean getCondition() {
        return false;
    }

    // Helper method to return a constant value
    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
        example.unreachableSwitch(); // Calling the method with unreachable switch statement
    }
}