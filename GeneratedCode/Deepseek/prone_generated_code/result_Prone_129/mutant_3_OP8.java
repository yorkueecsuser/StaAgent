// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo
class MutantClass {
    public void showMutant() {
        System.out.println("This is a mutant class generated from a renaming mutation");
    }
}