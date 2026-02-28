class StringComparisonExample {

    public boolean compareStrings(String s) {
        // This line uses '==' to compare strings, which is unreliable unless interning is used
        if (s == "example") return true; // BUG: UseEqualsToCompareStrings
        return false;
    }

    public boolean compareStringsProperly(String s) {
        // This method demonstrates the proper way to compare strings
        return "example".equals(s);
    }

    public boolean showBug(String input) {
        // Demonstrates the unreliable behavior using the buggy method
        return compareStrings(input);
    }

    public static void main(String[] args) {
        StringComparisonExample example = new StringComparisonExample();

        System.out.println(example.showBug("example")); // Output may vary depending on interning
        System.out.println(example.showBug(new String("example"))); // Usually false due to different memory references
    }
}

// Mutated code based on Renaming Mutation Operator
class StringComparisonExampleMutant1 {

    public boolean compareStrings(String a) { // Renamed variable 's' to 'a'
        // This line uses '==' to compare strings, which is unreliable unless interning is used
        if (a == "example") return true; // BUG: UseEqualsToCompareStrings
        return false;
    }

    public boolean compareStringsProperly(String b) { // Renamed variable 's' to 'b'
        // This method demonstrates the proper way to compare strings
        return "example".equals(b);
    }

    public boolean showBug(String c) { // Renamed variable 'input' to 'c'
        // Demonstrates the unreliable behavior using the buggy method
        return compareStrings(c);
    }

    public static void main(String[] args) {
        StringComparisonExampleMutant1 exampleMutant1 = new StringComparisonExampleMutant1(); // Renamed instance name

        System.out.println(exampleMutant1.showBug("example")); // Output may vary depending on interning
        System.out.println(exampleMutant1.showBug(new String("example"))); // Usually false due to different memory references
    }
}