class NullDereferenceExample {

    public String showBug(String input) {
        String vfyejuqx = null;
        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                vfyejuqx = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Value of vfyejuqx is guaranteed to be null when a NullPointerException is caught
            return vfyejuqx.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return vfyejuqx;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}