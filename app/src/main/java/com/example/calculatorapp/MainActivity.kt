package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.calculatorapp.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

binding=DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.btnPlus.setOnClickListener{
            val input1=binding.textInput1.text.toString().toInt()
            val input2=binding.textInput2.text.toString().toInt()
            binding.textView.text=(input1+input2).toString()
        }

        binding.btnMinus.setOnClickListener{
            val input1=binding.textInput1.text.toString().toInt()
            val input2=binding.textInput2.text.toString().toInt()
            binding.textView.text=(input1-input2).toString()
        }
        binding.btndivide.setOnClickListener{
            val input1=binding.textInput1.text.toString().toInt()
            val input2=binding.textInput2.text.toString().toInt()
            binding.textView.text=(input1/input2).toString()


        }

        binding.btnMultiplicatin.setOnClickListener{

            val input1=binding.textInput1.text.toString().toInt()
            val input2=binding.textInput2.text.toString().toInt()
            binding.textView.text=(input1*input2).toString()
        }

        binding.btnClear.setOnClickListener{
            var input1=binding.textInput1.text.toString()
            input1=""
            var input2=binding.textInput2.text.toString()
            input2=""
            binding.textView.text=""

        }
    }

}
