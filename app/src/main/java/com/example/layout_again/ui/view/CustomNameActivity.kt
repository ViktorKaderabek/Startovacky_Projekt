package com.example.layout_again.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.layout_again.R
import com.example.layout_again.databinding.ActivityCustomNameBinding

class CustomNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityCustomNameBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_custom_name)

       
        val intent = Intent(this, MainActivity::class.java)
        val title = binding.txtTitle.text

        binding.btnInsert.setOnClickListener {


            intent.putExtra("title", title.toString())
            setResult(1, intent)

            finish()
        }

        binding.btnBack.setOnClickListener {

            setResult(0, intent)
            finish()
        }
    }
}