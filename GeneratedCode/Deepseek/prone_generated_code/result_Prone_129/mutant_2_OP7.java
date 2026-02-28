// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// MUTANT: PackageInfo
class MutantClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }

    // The inserted mutation operator Unreachable while loop is here:
    boolean conditionWhile = false;
    while(conditionWhile){}
}