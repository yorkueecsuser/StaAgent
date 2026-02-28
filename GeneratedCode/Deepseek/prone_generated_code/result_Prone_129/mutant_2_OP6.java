// BUG: PackageInfo
class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
        
        // Mutation Operator name: Unreachable for loop
        for (int i = 0; false; i++) {
            /* Unreachable code */
        }
    }
}