package countdown.app.Pozicije

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import countdown.app.R

class Pozicija5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pozicija5)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setTitle("Pozicija 5")
    }
}