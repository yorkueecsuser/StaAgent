class Bug3460132 {

  String index = String.format("%2147483648$g", 42.0);
  String indexDuplicate = String.format("%2147483648$g", 42.0); // Duplicate of index

  String width = String.format("%2147483648g", 42.0);
  String widthDuplicate = String.format("%2147483648g", 42.0); // Duplicate of width

  String precision = String.format("%.2147483648g", 42.0);
  String precisionDuplicate = String.format("%.2147483648g", 42.0); // Duplicate of precision
}