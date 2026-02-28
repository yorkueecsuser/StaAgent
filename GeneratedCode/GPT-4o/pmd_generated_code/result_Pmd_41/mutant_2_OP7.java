class ResourceCleaner {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResource resource = new DummyResource();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + resource.getResourceName());
        
        // Insert unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is intentionally left unreachable
            System.out.println("This is an unreachable block.");
        }
    }
    
    // Helper method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
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