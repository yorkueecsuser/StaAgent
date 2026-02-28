import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Mutated code
  @Nonnull static final String a = "yyyyMMdd";

  @Nonnull static final String b = a.toLowerCase();
}