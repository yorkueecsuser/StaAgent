class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
        int value = getValue();
        switch(value) { case 1: /* code */ break; }
    }

    private int getValue() {
        return 0;
    }
}