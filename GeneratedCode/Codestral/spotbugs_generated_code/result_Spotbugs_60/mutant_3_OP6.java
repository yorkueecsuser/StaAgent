class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        try {
            // Inserting unreachable for loop
            boolean conditionFor = false;
            for (int i = 0; conditionFor; i++) {
                // This code is unreachable
                System.out.println("Unreachable code");
            }
            return data.length(); // Original bug still exists
        } catch (NullPointerException e) {
            return -1;
        }
    }
}