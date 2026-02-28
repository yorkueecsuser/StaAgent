class ResourceCleaner {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResource resource = new DummyResource();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + resource.getResourceName());

        // Adding an unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable because the condition is always false.");
        } else {
            System.out.println("This is the else branch of the unreachable if-else statement.");
        }
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

    private boolean getUnreachableCondition() {
        return false; // This method always returns false to simulate unreachable code
    }

    public static void main(String[] args) {
        ResourceCleaner cleaner = new ResourceCleaner();
        cleaner.showBug();
    }
}