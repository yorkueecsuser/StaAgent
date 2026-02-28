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

// Mutation: Renaming a user-defined variable
class ResourceCleanerMutant {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResourceMutant b = new DummyResourceMutant(); // Renamed the variable to 'b'
        // Simulating some operations with the resource
        System.out.println("Using resource: " + b.getResourceName());
    }

    // A dummy class that simulates a resource with an empty finalize method
    class DummyResourceMutant {
        private String resourceName = "DummyResource";

        public String getResourceName() {
            return resourceName;
        }

        @Override
        protected void finalize() {} // BUG: EmptyFinalizer
    }

    public static void main(String[] args) {
        ResourceCleanerMutant a = new ResourceCleanerMutant(); // Renamed the variable to 'a'
        a.showBug();
    }
}