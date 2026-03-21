
// BUG: PackageInfo
class PackageInfoBug {

    public static void main(String[] args) {
        PackageInfoBug bugDemo = new PackageInfoBug();
        System.out.println(bugDemo.showBug());
    }

    public String showBug() {
if (true && false && false && true && false && true && true && true && false && true && false) {byte jsszjyjg = -110;}else{char iobygrfu = 's';}

        return "This method demonstrates the bug.";
    
}
}

class PackageInfo {
    // This class is incorrectly placed in the same file as PackageInfoBug
    // It should not be here according to the bug rule.
    public String getMessage() {
        return "Incorrect class placement in package-info.java";
    }
}