package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

      btn_calcular.setOnClickListener {
          val peso: Float = edtPeso.text.toString().toFloat()
          val altura: Float = edtAltura.text.toString().toFloat()

          var alturaQ2 = altura * altura
          var resultado = peso / alturaQ2
          println("Gustavo" + resultado)
      }

        

    }
}