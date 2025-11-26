package com.miracle.emotionaldiary;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JSBridge {
    private Context context;

    public JSBridge(Context context) {
        this.context = context;
    }

    // 暴露给 JavaScript 调用的方法
    @JavascriptInterface
    public void showToast(String message) {
        Toast.makeText(context, "来自JS的信息: " + message, Toast.LENGTH_SHORT).show();
    }
}