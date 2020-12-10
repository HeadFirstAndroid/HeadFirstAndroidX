package me.yifeiyuan.headfirst.androidx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tencent.tauth.Tencent
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val tencent = Tencent.createInstance("your_app_id", this)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}