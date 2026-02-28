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

// Mutant Code
class ResourceCleanerMutant {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResourceMutant a = new DummyResourceMutant();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + a.getResourceName());
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
        ResourceCleanerMutant cleaner = new ResourceCleanerMutant();
        cleaner.showBug();
    }
}