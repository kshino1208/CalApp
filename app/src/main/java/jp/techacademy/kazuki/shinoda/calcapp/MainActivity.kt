package jp.techacademy.kazuki.shinoda.calcapp

import com.google.android.material.snackbar.Snackbar
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            button1.setOnClickListener(this)
            button2.setOnClickListener(this)
            button3.setOnClickListener(this)
            button4.setOnClickListener(this)


        }

        override fun onClick(v: View) {

             try{
                 val value1 = editText1.text.toString().toDouble()
                 val value2 = editText2.text.toString().toDouble()
                 val intent = Intent(this, Result::class.java)

                when(v.id){
                    R.id.button1 -> intent.putExtra("RESULT", value1 + value2)
                    R.id.button2 -> intent.putExtra("RESULT", value1 - value2)
                    R.id.button3 -> intent.putExtra("RESULT", value1 * value2)
                    R.id.button4 -> intent.putExtra("RESULT", value1 / value2)
                }
                startActivity(intent)

            } catch (e: Exception){

                val snackbar = Snackbar.make(root_layout,"何か数値を入力してください", Snackbar.LENGTH_LONG)
                snackbar.show()

            }



        }


}



