package jp.techacademy.kazuki.shinoda.calcapp

import com.google.android.material.snackbar.Snackbar
import android.content.Intent
import android.os.Bundle
import android.util.Log
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

                Log.d("test", "エラー１")
                when(v.id){
                    R.id.button1 -> intent.putExtra("RESULT", value1 + value2)
                    R.id.button2 -> intent.putExtra("RESULT", value1 - value2)
                    R.id.button3 -> intent.putExtra("RESULT", value1 * value2)
                    R.id.button4 -> intent.putExtra("RESULT", value1 / value2)
                }
                startActivity(intent)
                Log.d("test", "エラー２")

            } catch (e: Exception){
                Log.d("test", "エラー３")

                val snackbar = Snackbar.make(root_layout,"何か数値を入力してください", Snackbar.LENGTH_LONG)
                snackbar.show()

            }



//            if (value1 != null || value2 != null) {
//                Log.d("ANDROID", "エラー１")
//                when(v.id){
//                    R.id.button1 -> intent.putExtra("RESULT", value1 + value2)
//                    R.id.button2 -> intent.putExtra("RESULT", value1 - value2)
//                    R.id.button3 -> intent.putExtra("RESULT", value1 * value2)
//                    R.id.button4 -> intent.putExtra("RESULT", value1 / value2)
//                }
//                startActivity(intent)
//                Log.d("ANDROID", "エラー２")
//
//            } else {
//                Log.d("ANDROID", "エラー３")
//
//                val snackbar = Snackbar.make(root_layout,"メッセージ", Snackbar.LENGTH_LONG)
//                snackbar.show()
//
//            }


        }


}



