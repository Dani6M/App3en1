package dac.tresenunoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prestamo.*
import android.widget.Toast

class PrestamoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestamo)
        btnRegresar.setOnClickListener{
            finish()
        }
        var msj1: String ="";
        var msj2: String ="Calculo Realizando";

        btnCalcular.setOnClickListener(){
            var plazo: String = etxMensualidad.text.toString();
            var monto: Double = etxMonto.text.toString().toDouble();
            var interes: Double = etxAnual.text.toString().toDouble();
            if(plazo=="6"){
                var ia = interes / 100
                var i = ia/12

                var top = Math.pow((1+i),6.0)*i
                var end = Math.pow((1+i),6.0)-1

                var mensualida = monto*(top/end)
                var totalP = mensualida*6
                var totalIn = totalP-monto

                Toast.makeText(this,msj2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n"+
                                  "Mensualidad: $${mensualida.toString()}\n"+
                                  "Interes: $${totalIn.toString()} \n" +
                                  "Total a pagar: $${totalP.toString()}"
            }else if(plazo=="12"){
                var ia = interes / 100
                var i = ia/12

                var top = Math.pow((1+i),6.0)*i
                var end = Math.pow((1+i),6.0)-1

                var mensualida = monto*(top/end)
                var totalP = mensualida*12
                var totalIn = totalP-monto

                Toast.makeText(this,msj2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n"+
                        "Mensualidad: $${mensualida.toString()}\n"+
                        "Interes: $${totalIn.toString()} \n" +
                        "Total a pagar: $${totalP.toString()}"

            }else if(plazo=="18"){
                var ia = interes / 100
                var i = ia/12

                var top = Math.pow((1+i),6.0)*i
                var end = Math.pow((1+i),6.0)-1

                var mensualida = monto*(top/end)
                var totalP = mensualida*18
                var totalIn = totalP-monto

                Toast.makeText(this,msj2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n"+
                        "Mensualidad: $${mensualida.toString()}\n"+
                        "Interes: $${totalIn.toString()} \n" +
                        "Total a pagar: $${totalP.toString()}"

            }else if(plazo=="24"){
                var ia = interes / 100
                var i = ia/12

                var top = Math.pow((1+i),6.0)*i
                var end = Math.pow((1+i),6.0)-1

                var mensualida = monto*(top/end)
                var totalP = mensualida*24
                var totalIn = totalP-monto

                Toast.makeText(this,msj2, Toast.LENGTH_LONG).show()
                txvResultado.text="Monto Solicitado: $${monto.toString()}\n"+
                        "Mensualidad: $${mensualida.toString()}\n"+
                        "Interes: $${totalIn.toString()} \n" +
                        "Total a pagar: $${totalP.toString()}"

            }else{
                msj1 = "No se realizaron calculos"
                Toast.makeText(this,msj1, Toast.LENGTH_LONG).show()
            }
        }
    }
}
