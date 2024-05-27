package pnj.ac.id.lofyuu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            goToLoginForm()
        }, 3000L)
    }
    private fun goToLoginForm() {
        Intent(this, LoginForm::class.java).also {
            startActivity(it)
            finish()
        }
    }
}