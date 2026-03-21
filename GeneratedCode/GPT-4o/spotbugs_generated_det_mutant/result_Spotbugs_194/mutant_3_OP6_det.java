class BugDemo {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.showBug());
    }

    public static class Parent {
        public Parent() {
            for  (int mjrwcegi = 0; mjrwcegi < 0; mjrwcegi++) {byte gpgfkjkw = -57;}
            sayHello(); // BUG: MC: An overridable method is called from a constructor (MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR)
        
}

        public void sayHello() {
            System.out.println("Hello from Parent");
        }
    }

    public static class Child extends Parent {
        private String message;

        public Child() {
            this.message = "Hello from Child";
        }

        @Override
        public void sayHello() {
            System.out.println(message);
        }

        public String showBug() {
            return message;
        }
    }
}