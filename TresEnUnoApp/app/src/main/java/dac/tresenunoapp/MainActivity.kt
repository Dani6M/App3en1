package dac.tresenunoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        var mensaje: String=""
        when (item.itemId) {
            R.id.itmViaje -> {
                mensaje= "Selecciono Calculadora de viajes"
                startActivity(Intent(this, CViajeActivity::class.java))
            }
            R.id.itmPrestamo -> {
                mensaje= "Selecciono Prestamo"
                startActivity(Intent(this, PrestamoActivity::class.java))
            }

            R.id.itmJuego -> {
                mensaje= "Selecciono Juego"
               // startActivity(Intent(this, JuegoActivity::class.java))

            }
            R.id.itmSalir -> {
                System.exit(0)
            }

        }
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        return  super.onOptionsItemSelected(item)
    }

}
