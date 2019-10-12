package dac.tresenunoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val background = object : Thread() {
            override fun run() {
                try{
                    Thread.sleep(3000)

                    val ini = Intent(baseContext,MainActivity::class.java)
                    startActivity(ini)
                }catch(e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
