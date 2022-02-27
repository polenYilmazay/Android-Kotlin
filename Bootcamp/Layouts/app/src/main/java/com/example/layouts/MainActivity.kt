package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.layouts.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    //Aşağıda içini dolduracam demek.
    private lateinit var binding:ActivityMainBinding // Çoklu layout yapılarında veya view yapılarında kod kalabalıklığını engellemek için
    //xml uzantısının adı ne şekilde ise orası referans edilir bu yüzden adı activiymain oldu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater) //xml bağlayıcı olarak. Bu sayfaya çağırmak için
        setContentView(binding.root)

        //val  editText:EditText=findViewById(R.id.costOfServiceEditText)

        binding.calculateButton.setOnClickListener() {
            calculateTip()
        }


    }

    fun calculateTip(){

        val costOfServiceString=binding.costOfServiceEditText.text.toString()

        val amount=costOfServiceString.toDoubleOrNull()

        if(amount==null){
            binding.theAmountOfTheTipTextView.text= ""
            return
        }

        val sellectedRadioButton=binding.tipOptionsRadioGroup.checkedRadioButtonId

        val tippercente= when (sellectedRadioButton){

            R.id.twentyPercentRadioButton->0.20
            R.id.eighteenPercentRadioButton->0.18
            else -> 0.15

        }

        var tip= tippercente * amount

        val rollup=binding.rollUpTheTipSwitch.isChecked

        if(rollup){
            tip = kotlin.math.ceil(tip)
        }

        val theFormattedTip = NumberFormat.getCurrencyInstance(Locale.US).format(tip)
        binding.theAmountOfTheTipTextView.text=getString(R.string.theAmountOfTheTip,theFormattedTip)

        //binding.theAmountOfTheTipTextView.text="The Amount Of The Tip: $tip $"

    }
}