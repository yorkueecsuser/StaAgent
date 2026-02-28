// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is a buggy class declared in package-info.java file");
        }
        else {
            System.out.println("This is a buggy class declared in package-info.java file");
        }
    }

    private boolean getCondition() {
        return false;
    }
}

// BUG: PackageInfo