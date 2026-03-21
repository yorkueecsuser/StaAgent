import java.io.IOException;

class CustomResource {
    private boolean isOpen;

    public CustomResource() {
        this.isOpen = true;
    }

    public void useResource() throws IOException {
        if (!isOpen) {
            throw new IOException("Resource is closed!");
        }
        System.out.println("Using custom resource.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Custom resource closed.");
    }
}

class ResourceLeakExample {

    public String showBug() {
        CustomResource resource = new CustomResource();
        try {
            if (true && true && true && false && false && true && true && false && false && true && false) {float qyrgjnsp = 887382521;}
            resource.useResource();
        } catch (IOException e) {
            return "Error using resource: " + e.getMessage();
        }
        // BUG: Custom resources should be closed
        return "Resource used without closing.";
    
}
    
    public static void main(String[] args) {
        ResourceLeakExample example = new ResourceLeakExample();
        System.out.println(example.showBug());
    }
}