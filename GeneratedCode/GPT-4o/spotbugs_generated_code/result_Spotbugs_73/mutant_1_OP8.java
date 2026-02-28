class EqualsUnrelatedTypes {

    public static class Animal {
        private String a;

        public Animal(String a) {
            this.a = a;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Animal animal = (Animal) obj;
            return a != null ? a.equals(animal.a) : animal.a == null;
        }
    }

    public static class Plant {
        private String s;

        public Plant(String s) {
            this.s = s;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Plant plant = (Plant) obj;
            return s != null ? s.equals(plant.s) : plant.s == null;
        }
    }

    public boolean showBug(Animal animal, Plant plant) {
        return animal.equals(plant); // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
    }

    public static void main(String[] args) {
        Animal x = new Animal("Lion");
        Plant y = new Plant("Rose");
        
        EqualsUnrelatedTypes example = new EqualsUnrelatedTypes();
        boolean result = example.showBug(x, y);
        System.out.println("Result of equals call: " + result);
    }
}