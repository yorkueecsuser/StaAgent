import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import codetoanalyze.java.InferTaint;
import java.io.File;
import java.net.URISyntaxException;

class WebViews {

  void callWebviewSinks(WebView webview) {
    String stringSource = (String) InferTaint.inferSecretSource();

    webview.evaluateJavascript(stringSource, null);
    webview.loadData(stringSource, "", "");
    webview.loadDataWithBaseURL("", stringSource, "", "", "");
    webview.loadUrl(stringSource); // should have 5 reports
    webview.postUrl(stringSource, null);
    webview.postWebMessage(null, (Uri) InferTaint.inferSecretSource());

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      webview.clearCache(true);
    } else {
      // Another code that should also never run
      webview.clearHistory();
    }
  }

  // make sure all of the rules apply to subclasses as well
  class MyWebView extends WebView {
    public MyWebView(Context c) {
      super(c);
    }
  }

  Activity mActivity;

  class MyWebViewClient extends WebViewClient {

    @Override
    public void onLoadResource(WebView w, String url) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i); // should report
      } catch (URISyntaxException e) {
      }

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        w.clearCache(true);
      } else {
        // Another code that should also never run
        w.clearHistory();
      }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView w, WebResourceRequest request) {
      mActivity.startActivity(new Intent("action", request.getUrl())); // should report
      return null;

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        w.clearCache(true);
      } else {
        // Another code that should also never run
        w.clearHistory();
      }
    }

    File webResourceToFileBad(WebResourceRequest request) {
      return new File(request.getUrl().getPath());

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        return new File("");
      } else {
        // Another code that should also never run
        return new File("/");
      }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView w, String url) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i); // should report
      } catch (URISyntaxException e) {
      }
      return false;

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        return true;
      } else {
        // Another code that should also never run
        return false;
      }
    }
  }

  class MyWebChromeClient extends WebChromeClient {

    @Override
    public boolean onJsAlert(WebView w, String url, String message, JsResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        return true;
      } else {
        // Another code that should also never run
        return false;
      }
    }

    @Override
    public boolean onJsBeforeUnload(WebView w, String url, String m, JsResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        return true;
      } else {
        // Another code that should also never run
        return false;
      }
    }

    @Override
    public boolean onJsConfirm(WebView w, String url, String m, JsResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        return true;
      } else {
        // Another code that should also never run
        return false;
      }
    }

    @Override
    public boolean onJsPrompt(WebView w, String url, String m, String s, JsPromptResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;

      // Added mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        return true;
      } else {
        // Another code that should also never run
        return false;
      }
    }
  }

  void callWebviewSubclassSink(MyWebView webview) {
    String stringSource = (String) InferTaint.inferSecretSource();
    webview.evaluateJavascript(stringSource, null);

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      webview.clearCache(true);
    } else {
      // Another code that should also never run
      webview.clearHistory();
    }
  }

  class JsObject {
    @JavascriptInterface
    Object returnSource() {
      return InferTaint.inferSecretSource();
    }
  }

  // in order to get this, we have to understand that addJavaScriptInterface can evaluate the
  // JsObject.returnSource method
  void FN_addJavascriptInterface(MyWebView webview) {
    // should warn here
    webview.addJavascriptInterface(new JsObject(), "injectedObject");

    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      webview.clearCache(true);
    } else {
      // Another code that should also never run
      webview.clearHistory();
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}