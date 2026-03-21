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
        for  (int eiffuedq = 0; eiffuedq < 0; eiffuedq++) {int cjbzsrvq = -555396784;}
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