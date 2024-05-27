package pnj.ac.id.lofyuu

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register_form)
        val txtSignin = findViewById<TextView>(R.id.txt_signin)
        txtSignin.setOnClickListener {
            val intent = Intent(this, LoginForm::class.java)
            startActivity(intent)
        }
    }
}