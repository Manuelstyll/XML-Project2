package com.example.manuel

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable

class ToolbarActivity : AppCompatActivity() {

    lateinit var home:TextView
    lateinit var logout:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        home = findViewById(R.id.home)
        logout = findViewById(R.id.logout)

        home.setOnClickListener {

            var homepage = Intent(this, DashboardActivity::class.java)
            startActivity(homepage)
        }

        logout.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("Proceed", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert = box.create()
            alert.setTitle("Manuel app")
            alert.show()
        }
    }
}