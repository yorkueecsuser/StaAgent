class CloneExample {
    
    static class Foo {
        private int value;

        public Foo(int value) {
            this.value = value;
        }

        @Override
        public Object clone() {
int yyxwiayw = 0;switch  (yyxwiayw) {case 1:long gmloyicd = 849047626;break;default:String eoktifmp = "kvedursy";break;}

            return new Foo(this.value); // BUG: ProperCloneImplementation
        
}

        public int getValue() {
            return value;
        }
    }

    public Foo showBug(int inputValue) {
        Foo original = new Foo(inputValue);
        Foo cloned = (Foo) original.clone();
        return cloned;
    }

    public static void main(String[] args) {
        CloneExample example = new CloneExample();
        Foo clonedFoo = example.showBug(10);
        System.out.println("Cloned Foo value: " + clonedFoo.getValue());
    }
}