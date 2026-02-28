// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        boolean condition = false;
        if (condition) {
            System.out.println("This is a buggy class declared in package-info.java file");
        }
    }
}