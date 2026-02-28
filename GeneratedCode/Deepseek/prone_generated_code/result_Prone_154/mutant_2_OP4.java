class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        if (list.size() >= 0) {  // BUG: SizeGreaterThanOrEqualsZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }

        boolean alwaysFalse = false;  // Unreachable branch.
        if (alwaysFalse) {
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println("This statement is reachable.");
        }
    }
}