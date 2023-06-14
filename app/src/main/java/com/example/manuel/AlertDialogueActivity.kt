package com.example.manuel

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogueActivity : AppCompatActivity() {

    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialogue)

        btn = findViewById(R.id.btn17)

        btn.setOnClickListener {
            var box = AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("Proceed", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert = box.create()
            alert.setTitle("Manuel app")
            alert.show()

        }
    }
}