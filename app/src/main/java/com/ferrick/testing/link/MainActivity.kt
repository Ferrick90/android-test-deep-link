package com.ferrick.testing.link

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.button) as Button
        btn_click_me.setOnClickListener {
            System.out.println("Hello")

//            val action: String? = intent?.action
//            val data: Uri? = intent?.data
//            Uri myAction = Uri.parse(mEditText.getText().toString());
//
//            PackageManager packageManager = getPackageManager();
//            Intent intent = packageManager.getLaunchIntentForPackage(<app_destination_package>);
//
//            if (intent != null) {
//                intent.setAction(Intent.ACTION_VIEW);
//                intent.setData(myAction);
//                startActivity(intent);
//            }
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("comtsmmyshield://open")
            startActivity(openURL)
        }
    }

}
