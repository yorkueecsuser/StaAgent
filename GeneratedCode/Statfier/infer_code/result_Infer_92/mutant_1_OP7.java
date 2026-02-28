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

    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
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

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView w, WebResourceRequest request) {
      mActivity.startActivity(new Intent("action", request.getUrl())); // should report
      return null;

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }
    }

    File webResourceToFileBad(WebResourceRequest request) {
      return new File(request.getUrl().getPath());

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
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

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
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

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
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

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
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

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
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

      // Unreachable while loop mutation
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }
    }
  }

  void callWebviewSubclassSink(MyWebView webview) {
    String stringSource = (String) InferTaint.inferSecretSource();
    webview.evaluateJavascript(stringSource, null);

    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
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

    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}