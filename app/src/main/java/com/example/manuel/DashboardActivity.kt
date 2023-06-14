package com.example.manuel

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.NonCancellable.cancel
import org.w3c.dom.Text

class DashboardActivity : AppCompatActivity() {
    lateinit var home:CardView
    lateinit var chat:CardView
    lateinit var profile: CardView
    lateinit var settings: CardView
    lateinit var widgets: CardView
    lateinit var logout: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home = findViewById(R.id.cardHome)
        chat = findViewById(R.id.cardChat)
        profile = findViewById(R.id.cardProfile)
        settings = findViewById(R.id.cardSettings)
        widgets = findViewById(R.id.cardWidgets)
        logout = findViewById(R.id.cardLogout)

        home.setOnClickListener{
            Toast.makeText(applicationContext, "You have clicked home", Toast.LENGTH_LONG).show()
            var web1 = Intent(this, FragmentActivity::class.java)
            startActivity(web1)

        }

        chat.setOnClickListener{
            Toast.makeText(applicationContext, "You have clicked chat", Toast.LENGTH_LONG).show()
            var web = Intent(this, WebViewActivity::class.java)
            startActivity(web)
        }

        profile.setOnClickListener{
            Toast.makeText(applicationContext, "You have clicked profile", Toast.LENGTH_LONG).show()
            var list = Intent(this,MapsActivity::class.java)
            startActivity(list)
        }

        settings.setOnClickListener{
            Toast.makeText(applicationContext, "You have clicked settings", Toast.LENGTH_LONG).show()
            var tool = Intent(this,ToolbarActivity::class.java)
            startActivity(tool)
        }

        widgets.setOnClickListener{
            Toast.makeText(applicationContext, "You have clicked widgets", Toast.LENGTH_LONG).show()
            var text = Intent(this,ScrollViewActivity::class.java)
            startActivity(text)

        }

        logout.setOnClickListener{
            Toast.makeText(applicationContext, "You have clicked logout", Toast.LENGTH_LONG).show()

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