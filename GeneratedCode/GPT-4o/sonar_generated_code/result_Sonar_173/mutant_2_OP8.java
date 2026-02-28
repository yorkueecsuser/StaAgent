class FinalizeMethodExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public void showBug() {
        try {
            FinalizeMethodExample example = new FinalizeMethodExample();
            example.dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug();
    }
}

// Mutant Code
class FinalizeMethodExampleMutant {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method executed.");
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    }

    public void showBug() {
        try {
            FinalizeMethodExampleMutant example = new FinalizeMethodExampleMutant(); // "example" variable renamed to "a"
            example.dispose();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeMethodExampleMutant a = new FinalizeMethodExampleMutant(); // "example" variable renamed to "a"
        a.showBug();
    }
}