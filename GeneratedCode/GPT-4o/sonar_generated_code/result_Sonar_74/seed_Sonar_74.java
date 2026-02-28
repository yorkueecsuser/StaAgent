class ResourceLeakExample {

    // A custom resource class that should be closed after use
    static class CustomResource {
        private boolean isOpen = false;

        public void open() {
            isOpen = true;
            System.out.println("Resource opened.");
        }

        public void process() {
            if (!isOpen) {
                throw new IllegalStateException("Resource is not open!");
            }
            System.out.println("Processing resource...");
        }

        public void close() {
            if (isOpen) {
                isOpen = false;
                System.out.println("Resource closed.");
            }
        }
    }

    public String showBug() {
        CustomResource resource = new CustomResource();
        resource.open();
        resource.process();
        // BUG: Custom resources should be closed
        return "Resource processed but not closed.";
    }

    public static void main(String[] args) {
        ResourceLeakExample example = new ResourceLeakExample();
        System.out.println(example.showBug());
    }
}