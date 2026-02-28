class ResourceCleaner {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResource resource = new DummyResource();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + resource.getResourceName());

        // Unreachable while loop mutant
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    // Method to provide a non-final condition for the while loop
    private boolean getUnreachableCondition() {
        return false; // The condition is false at runtime
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