// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }

    public void showDuplicatedBug() {
        System.out.println("This is a duplicated buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo