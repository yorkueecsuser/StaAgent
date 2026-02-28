class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }
}

// Unreachable if-else statement
class BuggyToString2 {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}