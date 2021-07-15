package com.example.layout_again.ui.view

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.layout_again.R
import com.example.layout_again.databinding.ActivityMainBinding
import com.example.layout_again.ui.viewmodel.MainViewModel
import com.example.layout_again.ui.adapter.PlaceAdapterView
import com.mikepenz.fastadapter.FastAdapter
import kotlin.random.Random


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
            ) // promena ktera uchovava vsechny informace o xml activity_main a ma pristup ke vsem view elementum a lze se k nim dostat po napsani "binding."

       mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val itemAddIntent = Intent(this, CustomNameActivity::class.java)

        val fastAdapter =
            FastAdapter.with(mainViewModel.itemAdapter) //promenna ktera v sobe uchovava udaje o tom co je v adapteru

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = fastAdapter // Nastavuje recyclerview co bude obsahem
        binding.recyclerView.setHasFixedSize(true)

        mainViewModel.getNumber().observe(this, Observer { binding.txtItemCountItem.text = it })

        binding.btnPlus.setOnClickListener {

            startActivityForResult(itemAddIntent, 1)
        }
        binding.btnNote.setOnClickListener {

            val index: Int = Random.nextInt(1)
            mainViewModel.itemAdapter.remove(index)
            fastAdapter.notifyDataSetChanged()
            mainViewModel.deleteNumber()
            mainViewModel.getMessage().observe(this, Observer {    Toast.makeText(this, it, Toast.LENGTH_SHORT).show() })
        }

        binding.btnMista.setOnClickListener {

            binding.btnMista.setBackgroundColor(Color.RED)
            binding.btnMista.setTextColor(Color.WHITE)
            binding.btnStartovacky.setBackgroundColor(Color.WHITE)
            binding.btnStartovacky.setTextColor(Color.BLACK)
            binding.cardViewStartovacky.cardElevation = 10F
            binding.cardViewMista.cardElevation = 0F
        }
        binding.btnStartovacky.setOnClickListener {

            binding.btnStartovacky.setBackgroundColor(Color.RED)
            binding.btnStartovacky.setTextColor(Color.WHITE)
            binding.btnMista.setBackgroundColor(Color.WHITE)
            binding.btnMista.setTextColor(Color.BLACK)
            binding.cardViewStartovacky.cardElevation = 0F
            binding.cardViewMista.cardElevation = 10F
        }
        binding.btnAbc.setOnClickListener {

            binding.btnAbc.setBackgroundColor(Color.parseColor("#bdbdbd"))
            binding.btnLetovo.setTextColor(Color.parseColor("#3da142"))
            binding.btnNejblize.setBackgroundColor(Color.WHITE)
            binding.btnLetovo.setBackgroundColor(Color.WHITE)
            binding.btnZeme.setBackgroundColor(Color.WHITE)
            binding.cardViewAbc.cardElevation = 10F
            binding.cardViewNejblize.cardElevation = 0F
            binding.cardViewLetovo.cardElevation = 0F
            binding.cardViewZeme.cardElevation = 0F
        }
        binding.btnNejblize.setOnClickListener {

            binding.btnAbc.setBackgroundColor(Color.WHITE)
            binding.btnNejblize.setBackgroundColor(Color.parseColor("#bdbdbd"))
            binding.btnLetovo.setBackgroundColor(Color.WHITE)
            binding.btnLetovo.setTextColor(Color.parseColor("#3da142"))
            binding.btnZeme.setBackgroundColor(Color.WHITE)
            binding.cardViewAbc.cardElevation = 0F
            binding.cardViewNejblize.cardElevation = 10F
            binding.cardViewLetovo.cardElevation = 0F
            binding.cardViewZeme.cardElevation = 0F
        }
        binding.btnLetovo.setOnClickListener {

            binding.btnAbc.setBackgroundColor(Color.WHITE)
            binding.btnNejblize.setBackgroundColor(Color.WHITE)
            binding.btnLetovo.setBackgroundColor(Color.parseColor("#3da142"))
            binding.btnLetovo.setTextColor(Color.WHITE)
            binding.btnZeme.setBackgroundColor(Color.WHITE)
            binding.cardViewAbc.cardElevation = 0F
            binding.cardViewNejblize.cardElevation = 0F
            binding.cardViewLetovo.cardElevation = 10F
            binding.cardViewZeme.cardElevation = 0F
        }
        binding.btnZeme.setOnClickListener {

            binding.btnAbc.setBackgroundColor(Color.WHITE)
            binding.btnNejblize.setBackgroundColor(Color.WHITE)
            binding.btnLetovo.setBackgroundColor(Color.WHITE)
            binding.btnLetovo.setTextColor(Color.parseColor("#3da142"))
            binding.btnZeme.setBackgroundColor(Color.parseColor("#bdbdbd"))
            binding.cardViewAbc.cardElevation = 0F
            binding.cardViewNejblize.cardElevation = 0F
            binding.cardViewLetovo.cardElevation = 0F
            binding.cardViewZeme.cardElevation = 10F
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1) {

            if (resultCode == 1) {

                val mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
                val index: Int = Random.nextInt(1)

                mainViewModel.itemAdapter.add(
                    index,
                    PlaceAdapterView(
                        mainViewModel.addItem(
                            title = data?.getStringExtra("title").toString()
                        )
                    )
                )
                mainViewModel.addNumber()
                mainViewModel.getMessage().observe(this, Observer {    Toast.makeText(this, it, Toast.LENGTH_SHORT).show() })
                // rikam programu ze ma pridat funkci ktera vraci newItem s parametrem title
            }
        }
    }


    fun getBinding() : ActivityMainBinding {

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
            )
        return binding
    }
}





