package com.example.simpleform


import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assuming you have imported the EditText and Button views
        val editTextFirstName = findViewById<EditText>(R.id.editText_firstname)
        val editTextLastName = findViewById<EditText>(R.id.editText_lastname)
        val editTextMultiLIne_address = findViewById<EditText>(R.id.editTextMultiLine_address)
        val editTextMultiLIne_email = findViewById<EditText>(R.id.)

        val registerButton = findViewById<Button>(R.id.button_register)


        val genderRadioGroup = findViewById<RadioGroup>(R.id.radioGroup_gender)

        genderRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioButton_male -> {
                    // Male is selected, handle accordingly
                }

                R.id.radioButton_female -> {
                    // Female is selected, handle accordingly
                }
            }
        }
        var agreeToTerms: Boolean = false
        val checkBoxTerms = findViewById<CheckBox>(R.id.checkBox_term)

        registerButton.isEnabled = false

        checkBoxTerms.setOnCheckedChangeListener { _, isChecked ->
            // Update the agreeToTerms variable when the checkbox state changes
            agreeToTerms = isChecked

            // Enable or disable the Register button based on the checkbox state
            registerButton.isEnabled = isChecked
        }

        registerButton.setOnClickListener {
            // When the "Register" button is clicked, this code is executed
            val firstName = editTextFirstName.text.toString()
            val addressText = editTextMultiLIne_address.text.toString()

            val selectedGender = when (genderRadioGroup.checkedRadioButtonId) {
                R.id.radioButton_male -> "Male"
                R.id.radioButton_female -> "Female"
                else -> "No gender selected"
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}