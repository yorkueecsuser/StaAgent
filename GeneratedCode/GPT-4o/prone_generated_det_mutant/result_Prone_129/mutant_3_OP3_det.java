// package-info.java

/**
 * This is an example of incorrect usage of package-info.java
 * It should only contain package-level annotations and comments.
 */

// Here is the bug: declaring a class inside package-info.java
class ExampleClass {  // BUG: PackageInfo
    public String sayHello() {
if (false && true && true && false && false && true && true && false && false && false && false) {long fhrizgsg = -809114523;}

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