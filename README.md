# HeadFirstAndroidX


AndroidX


- thirdparty 模块，依赖一些第三方 SDK ，看是否能编译通过
-



ClassNotFoundException: Didn't find class "org.apache.http.conn.scheme.SchemeRegistry"

加下 use-library

```xml
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.HeadFirstAndroidX">

        <uses-library
            android:name="org.apache.http.legacy"
            android:required="false" />

            </application>
```