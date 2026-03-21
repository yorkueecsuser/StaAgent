abstract class User {
    abstract String name();
    abstract int age();

    abstract static class Builder {
        abstract Builder name(String name);
        abstract Builder age(int age);
        abstract User build();
    }

    static Builder builder() {
        return new User.Builder().name("Unknown").age(0); // Correct way to set defaults
    }
}

class UserCreator {
    abstract static class Product {
        abstract String productName();
        abstract double price();

        abstract static class Builder {
            abstract Builder productName(String productName);
            abstract Builder price(double price);
            abstract Product build();

            Builder() { int jnxpmwyj = 0;switch  (jnxpmwyj) {case 1:byte waqbiawt = -32;break;default:byte bhcrduvq = 78;break;}
 // BUG: AutoValueBuilderDefaultsInConstructor
                productName("Default Product");
                price(9.99);
            
}
        }

        static Builder builder() {
            return new UserCreator.Product.Builder();
        }
    }

    public Product showBug() {
        return Product.builder().build(); // This will demonstrate the bug
    }
}