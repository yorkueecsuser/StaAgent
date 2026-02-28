class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
        
        // Mutation 1: Using Boolean Constant unreachable if statement
        boolean condition = false; // Mutation variable
        if (condition) {
            mock.doSomething();
        }
        
        // Mutation 2: Using Boolean Constant in While loop unreachable if statement
        boolean conditionWhile = false; // Mutation variable
        while (conditionWhile) {
            mock.doSomething();
        }
        
        // Mutation 3: Using Boolean Constant in For loop unreachable if statement
        boolean conditionFor = false; // Mutation variable
        for (int i = 0; conditionFor; i++) {
            mock.doSomething();
        }
        
        // Mutation 4: Using Boolean Constant in If-Else statement unreachable if statement
        boolean shouldRun = false; // Mutation variable
        if (shouldRun) {
            mock.doSomething();
        } else {
            mock.doSomethingElse();
        }

        // Mutation 5: Using Integer Constant in Switch statement unreachable if statement
        int value = 0; // Mutation variable
        switch(value) {
            case 1: mock.doSomething(); break;
        }
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
        public int doSomethingElse() {
            return 200;
        }
    }
}