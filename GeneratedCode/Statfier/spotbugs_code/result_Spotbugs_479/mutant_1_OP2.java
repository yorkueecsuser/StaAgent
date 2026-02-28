class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String indexCopy = String.format("%2147483648$g", 42.0); // Duplicate of index assignment

  String width = String.format("%2147483648g", 42.0);
  String widthCopy = String.format("%2147483648g", 42.0); // Duplicate of width assignment

  String precision = String.format("%.2147483648g", 42.0);
  String precisionCopy = String.format("%.2147483648g", 42.0); // Duplicate of precision assignment
}