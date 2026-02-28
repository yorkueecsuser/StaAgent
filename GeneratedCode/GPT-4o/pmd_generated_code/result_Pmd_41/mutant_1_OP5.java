class ResourceCleaner {

    // Method to demonstrate the bug
    public void showBug() {
        DummyResource resource = new DummyResource();
        // Simulating some operations with the resource
        System.out.println("Using resource: " + resource.getResourceName());
        
        // Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableValue();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // No default action
                break;
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
    
    // Method to ensure the switch statement remains unreachable
    private int getUnreachableValue() {
        return 0; // This ensures the switch case never matches
    }

    public static void main(String[] args) {
        ResourceCleaner cleaner = new ResourceCleaner();
        cleaner.showBug();
    }
}