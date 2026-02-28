// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String z; // Mutant: Renamed'message' to 'z'

    public BadPackageInfoExample(String z) { // Mutant: Renamed parameter'message' to 'z'
        this.z = z;
    }

    public String getZ() { // Mutant: Renamed 'getMessage' to 'getZ'
        return z;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}