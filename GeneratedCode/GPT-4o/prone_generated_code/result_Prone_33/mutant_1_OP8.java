class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;

        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }

        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}

// Mutant Code
class DereferenceWithNullBranchExampleMutant {

    public String showBug(Integer i) {
        String r = null;

        // Assuming i represents some complex logic where it might be null
        if (i == null) {
            // Do nothing, r remains null
        } else {
            r = "Input is: " + i;
        }

        // Dereferencing r which can be null if i was null
        return r.toUpperCase(); // BUG: DereferenceWithNullBranch
    }

    public static void main(String[] args) {
        DereferenceWithNullBranchExampleMutant exampleMutant = new DereferenceWithNullBranchExampleMutant();
        System.out.println(exampleMutant.showBug(null)); // This will throw a NullPointerException
    }
}