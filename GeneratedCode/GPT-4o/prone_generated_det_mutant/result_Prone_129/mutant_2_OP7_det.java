// package-info.java

/**
 * This is an example of incorrect usage of package-info.java
 * It should only contain package-level annotations and comments.
 */

// Here is the bug: declaring a class inside package-info.java
class ExampleClass {  // BUG: PackageInfo
    public String sayHello() {
boolean gkyrbofv = false;while (gkyrbofv && false && true && true && true && false && false && true && true && false && true && false) {long xyyutloi = 51759732;}

        return "Hello, World!";
    
}
}

class PackageInfoDemonstration {

    public String showBug() {
        ExampleClass example = new ExampleClass();
        return example.sayHello();
    }

    public static void main(String[] args) {
        PackageInfoDemonstration demo = new PackageInfoDemonstration();
        System.out.println(demo.showBug());
    }
}