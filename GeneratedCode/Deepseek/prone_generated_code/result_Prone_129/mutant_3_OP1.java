// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// MUTANT CODE: PackageInfo
String deadStore_123abc = "deadStore_123abc"; // This is the added dead store.