class NonNullParameterBug {
    public String processString(String input) {
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) { // Unreachable switch statement
            case 1:
                System.out.println("This line should never be executed");
                break;
        }
        return input.toUpperCase(); // original bug is still present
    }

    public String showBug() {
        return processString(null);
    }
}