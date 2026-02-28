import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Mutant code added for Dead Store mutation
  String qzjfnxrd = "unusedVariable";
}