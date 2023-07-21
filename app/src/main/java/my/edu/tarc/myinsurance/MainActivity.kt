package my.edu.tarc.myinsurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.edu.tarc.myinsurance.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //inflate something = show something = show UI
        //binding = UI tree
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroupGender.checkedRadioButtonId
            val smoker = binding.checkBoxSmoker.isChecked
            var premium = 0

            if(age == 0){ //Less than 17
                premium = 60
            }
            else if(age == 1){ //17-25
                premium = 70

                if(gender == binding.radioButtonMale.id){
                    premium+=50
                }
                if(smoker == true){
                    premium+=100
                }
            }
            else if(age == 2){ //Less than 17
                premium = 90

                if(gender == binding.radioButtonMale.id){
                    premium+=100
                }
                if(smoker == true){
                    premium+=150
                }
            }
            else if(age == 3){ //Less than 17
                premium = 120

                if(gender == binding.radioButtonMale.id){
                    premium+=150
                }
                if(smoker == true){
                    premium+=200
                }
            }
            else if(age == 4){ //Less than 17
                premium = 150

                if(gender == binding.radioButtonMale.id){
                    premium+=200
                }
                if(smoker == true){
                    premium+=250
                }
            }
            else if(age == 5){ //Less than 17
                premium = 150

                if(gender == binding.radioButtonMale.id){
                    premium+=200
                }
                if(smoker == true){
                    premium+=300
                }
            }

            binding.textViewPremiumAmount.text = premium.toString()


        }

        binding.buttonReset.setOnClickListener {
            binding.spinnerAge.setSelection(0)
            binding.radioGroupGender.clearCheck()
            binding.checkBoxSmoker.isChecked = false
            binding.textViewPremiumAmount.text = "0"
        }
    }


}