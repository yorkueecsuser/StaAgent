class ResourceCleaner {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResource resource = new DummyResource();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + resource.getResourceName());
    }

    // A dummy class that simulates a resource with an empty finalize method
    class DummyResource {
        private String resourceName = "DummyResource";

        public String getResourceName() {
            return resourceName;
        }

        @Override
        protected void finalize() {} // BUG: EmptyFinalizer
    }

    public static void main(String[] args) {
        ResourceCleaner cleaner = new ResourceCleaner();
        cleaner.showBug();
    }
}

// Mutated code with Renaming Mutation Operator
class MutatedResourceCleaner {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResource resource = new DummyResource();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + resource.getResourceName());
    }

    // A dummy class that simulates a resource with an empty finalize method
    class DummyResource {
        private String z = "DummyResource"; // Renaming the variable resourceName to z

        public String getResourceName() {
            return z; // Using the renamed variable
        }

        @Override
        protected void finalize() {} // BUG: EmptyFinalizer
    }

    public static void main(String[] args) {
        MutatedResourceCleaner cleaner = new MutatedResourceCleaner();
        cleaner.showBug();
    }
}