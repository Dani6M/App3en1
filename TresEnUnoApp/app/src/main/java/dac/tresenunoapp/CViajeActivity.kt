package dac.tresenunoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cviaje.*

class CViajeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cviaje)
        btnRegresar.setOnClickListener {
            finish()
        }
        var msj1: String ="";
        var msj2: String ="Calculo Realizando";

        btnCalcular.setOnClickListener(){
            var km: Double = etxKm.text.toString().toDouble();
            var precio: Double = etxPrecio.text.toString().toDouble();
            var litros: Double = etxLitros.text.toString().toDouble();
            var hr: Double = etxHoras.text.toString().toDouble();
            var min: Double = etxMin.text.toString().toDouble();
            if(rdb100KM.isChecked){
                var preciolitros = litros/precio
                var pl = (preciolitros*100)/km
                var litrosprecio = pl*precio
                var minhr = min/60
                var tiempo=hr+minhr
                var velocidad = km/tiempo

                Toast.makeText(this, msj2, Toast.LENGTH_LONG).show()
                txvResultado.text="Consumo de litros: ${preciolitros.toString()}\n" +
                        "Dinero gastado: ${litrosprecio.toString()} \n" +
                        "Velocidad Media: ${velocidad.toString()}"

            }else if(rdb1KM.isChecked){

                var preciolitros = litros/precio
                var pl = preciolitros/km
                var litrosprecio = pl*precio
                var minhr = min/60
                var tiempo=hr+minhr
                var velocidad = km/tiempo

                Toast.makeText(this, msj2, Toast.LENGTH_LONG).show()
                txvResultado.text="Consumo de litros: ${preciolitros.toString()}\n" +
                        "Dinero gastado: ${litrosprecio.toString()} \n" +
                        "Velocidad Media: ${velocidad.toString()}"

            }else{
                msj1 = "No se realizo ningun calculo";
                Toast.makeText(this, msj1, Toast.LENGTH_LONG).show()
            }
        }
    }
}
