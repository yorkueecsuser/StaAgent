class ResourceCleaner {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResource resource = new DummyResource();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + resource.getResourceName());

        // Inserting an unreachable while loop as a mutation
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
    }

    // Helper method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false; // This is not a compile-time constant since it's returned from a method
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