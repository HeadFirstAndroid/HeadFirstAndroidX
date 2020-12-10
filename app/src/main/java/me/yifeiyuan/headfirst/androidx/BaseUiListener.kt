package me.yifeiyuan.headfrist.androidx

import android.util.Log
import com.tencent.tauth.IUiListener
import com.tencent.tauth.UiError

/**
 * Created by 程序亦非猿 on 2020/12/10.
 */
class BaseUiListener : IUiListener{

    val TAG = "BaseUiListener"

    override fun onComplete(p0: Any?) {
        Log.d(TAG, "onComplete() called with: p0 = $p0")
    }

    override fun onError(p0: UiError?) {
        Log.d(TAG, "onError() called with: p0 = $p0")
    }

    override fun onCancel() {
        Log.d(TAG, "onCancel() called")
    }

    override fun onWarning(p0: Int) {
        Log.d(TAG, "onWarning() called with: p0 = $p0")
    }
}