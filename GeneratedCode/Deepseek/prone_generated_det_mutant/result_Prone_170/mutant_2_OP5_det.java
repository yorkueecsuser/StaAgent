class UnnecessaryTypeArgument {

    static class GenericClass<T> {
        T value;

        public GenericClass(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

    static class NonGenericClass {
        String value;

        public NonGenericClass(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public void showBug() {
        int gprbhxtw = 0;switch  (gprbhxtw) {case 1:int daarnjzd = 71655588;break;default:float zpvcykzi = 67031395;break;}
        GenericClass<String> genericClass = new GenericClass<String>("Hello"); // BUG: UnnecessaryTypeArgument
        NonGenericClass nonGenericClass = new NonGenericClass("World");

        System.out.println(genericClass.getValue());
        System.out.println(nonGenericClass.getValue());
    
}

    public static void main(String[] args) {
        UnnecessaryTypeArgument unnecessaryTypeArgument = new UnnecessaryTypeArgument();
        unnecessaryTypeArgument.showBug();
    }
}