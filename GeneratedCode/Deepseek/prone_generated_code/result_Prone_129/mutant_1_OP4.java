// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo

class MutantClass {
    public void showMutant() {
        System.out.println("This is a mutant class declared in package-info.java file");
    }

    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}