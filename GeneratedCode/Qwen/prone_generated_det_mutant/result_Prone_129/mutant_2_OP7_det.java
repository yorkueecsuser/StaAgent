
// BUG: PackageInfo
class PackageInfoBug {

    public static void main(String[] args) {
        PackageInfoBug bugDemo = new PackageInfoBug();
        System.out.println(bugDemo.showBug());
    }

    public String showBug() {
boolean mllmitun = false;while (mllmitun && true && false && false && false && true && true && true && true && true && false && false) {char yjjcyhqm = 'd';}

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