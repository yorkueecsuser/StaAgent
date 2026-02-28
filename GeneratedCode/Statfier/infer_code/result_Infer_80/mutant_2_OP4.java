import android.content.ClipboardManager;
import android.text.Html;
import android.text.Spanned;
import android.widget.EditText;
import codetoanalyze.java.InferTaint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class UserControlledStrings {
  ClipboardManager clipboard;

  void readClipboardSourcesBad() {
    InferTaint.inferSensitiveSink(clipboard.getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5));
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5).getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().toString());
    // 5 reports

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  Spanned clipboardToHtmlBad() {
    return Html.fromHtml(clipboard.getText().toString());

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  EditText mEditText;

  Spanned editTextToHtmlBad() {
    return Html.fromHtml(mEditText.getText().toString());

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  void clipboardToShellDirectBad() throws IOException {
    Runtime.getRuntime().exec(clipboard.getText().toString());

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  void clipboardToShellArrayBad() throws IOException {
    String[] cmds = new String[] {"ls", clipboard.getText().toString()};
    Runtime.getRuntime().exec(cmds);

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  ProcessBuilder clipboardToProcessBuilder1Bad() {
    return new ProcessBuilder(clipboard.getText().toString());

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  ProcessBuilder clipboardToProcessBuilder2Bad() {
    return new ProcessBuilder("sh", clipboard.getText().toString());

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  ProcessBuilder clipboardToProcessBuilder3Bad(ProcessBuilder builder) {
    return builder.command(clipboard.getText().toString());

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  ProcessBuilder clipboardToProcessBuilder4Bad(ProcessBuilder builder) {
    List<String> cmds = new ArrayList();
    cmds.add(clipboard.getText().toString());
    return builder.command(cmds);

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never run because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always run
      System.out.println("This is the reachable block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}