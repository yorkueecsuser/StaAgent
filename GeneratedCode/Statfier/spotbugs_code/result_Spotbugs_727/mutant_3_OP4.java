/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/2019">GitHub Issue</a>
 */
class Issue2019 {

  static class ATNSimulator {
    public int adaptivePredict() {
      return 0;
    }
  }

  static class ParserATNSimulator extends ATNSimulator {}

  static class Recognizer<ATNInterpreter extends ATNSimulator> {
    public ATNInterpreter getInterpreter() {
      return null;
    }
  }

  static class BaseParser extends Recognizer<ParserATNSimulator> {}

  public static class Parser extends BaseParser {

    public void text() {
      int _alt = 1;
      do {
        switch (_alt) {
          case 1:
            if (_alt == 1) {
              continue;
            }
            // Mutant: Adding an unreachable if-else statement
            boolean shouldRun = getShouldRun();
            if (shouldRun) {
              System.out.println("This will never be printed");
            } else {
              System.out.println("This will also never be printed");
            }
            break;
          default:
            throw new RuntimeException();
        }
        _alt = getInterpreter().adaptivePredict();
      } while (_alt!= 2);
    }

    // Method to provide a dynamic condition for the mutant
    private boolean getShouldRun() {
      return false; // This method always returns false, making the if-else unreachable
    }
  }
}