package com.example.pruebaet

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.botontrol)
        val editText = findViewById<EditText>(R.id.et1)
        val imageV = findViewById<ImageView>(R.id.imageView2)


        boton1.setOnClickListener{
            if (boton1.text.equals(getString(R.string.com))){
                editText.setVisibility(View.VISIBLE)
                boton1.setText(" FINALIZAR ")
            }else{
                Log.d("Polla","Polla")
                editText.onEditorAction(EditorInfo.IME_ACTION_DONE)
                editText.clearFocus()
                fondos(editText,imageV,boton1)
            }
        }
    }


    fun fondos(editText: EditText,imageV: ImageView,Boton: Button){
        val lay = findViewById<ConstraintLayout>(R.id.idlay)
        if (editText.text.toString().toLowerCase().equals("wayne")){
            imageV.setImageResource(R.mipmap.batman)
            Boton.setBackgroundColor(getColor(R.color.barman1))
            lay.setBackgroundColor(getColor(R.color.barman2))
        }else{
            if (editText.text.toString().toLowerCase().equals("joker")){
                imageV.setImageResource(R.mipmap.joker)
                Boton.setBackgroundColor(getColor(R.color.joke1))
                lay.setBackgroundColor(getColor(R.color.joke2))

            }
        }
    }
}