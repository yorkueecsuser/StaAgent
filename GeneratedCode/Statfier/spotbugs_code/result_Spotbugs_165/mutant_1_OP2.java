import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";
  @Nonnull static final String field1_duplicate = "yyyyMMdd"; // Duplicate of field1 assignment

  @Nonnull static final String field2 = field1.toLowerCase();
}