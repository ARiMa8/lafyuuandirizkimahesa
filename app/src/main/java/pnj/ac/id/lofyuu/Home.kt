package pnj.ac.id.lofyuu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val tvFlashSale = findViewById<TextView>(R.id.see_more_flash_sale)
        tvFlashSale.setOnClickListener {
            val intent = Intent(this, FlashSale::class.java)
            startActivity(intent)
        }

        val ivFavorite = findViewById<ImageView>(R.id.love)
        ivFavorite.setOnClickListener {
            val intent = Intent(this, FavoritProduct::class.java)
            startActivity(intent)
        }

        val ivShoe = findViewById<ImageView>(R.id.iv_shoe_red)
        ivShoe.setOnClickListener {
            val intent = Intent(this, ProductDetail::class.java)
            startActivity(intent)
        }

        val tvShoe = findViewById<TextView>(R.id.tv_shoe_red)
        tvShoe.setOnClickListener {
            val intent = Intent(this, ProductDetail::class.java)
        }



    }
}