// BUG: PackageInfo
class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// MUTANT: PackageInfo
class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }

    // Unreachable switch statement
    public void unreachableSwitchStatement() {
        int compileTimeConstant = 1;
        switch(compileTimeConstant) {
            case 0: 
                System.out.println("This switch case should be unreachable");
                break;
            default: 
                break;
        }
    }
}