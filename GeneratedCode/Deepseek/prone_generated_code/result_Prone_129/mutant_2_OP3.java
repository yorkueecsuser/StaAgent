// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo
class MutatedClass {
    public void showMutation() {
        boolean condition = false; // Assigning false to make the if statement unreachable
        if (condition) {
            System.out.println("This is a mutation created to make the original code unreachable");
        }
    }
}