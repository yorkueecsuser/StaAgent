// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo
class RenamedBuggyClass {
    public void showMutatedBug() {
        System.out.println("This is a mutated class declared in package-info.java file");
    }
}