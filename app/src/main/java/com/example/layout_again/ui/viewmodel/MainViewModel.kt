package com.example.layout_again.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.layout_again.R
import com.example.layout_again.data.PlaceItem
import com.example.layout_again.ui.adapter.PlaceAdapterView
import com.mikepenz.fastadapter.adapters.ItemAdapter

open class MainViewModel : ViewModel() {

     val itemAdapter =
        ItemAdapter<PlaceAdapterView>()

    private val itemCount = MutableLiveData<String>()
    private var number : Int = 0
    private val message = MutableLiveData<String>()

    fun addNumber(){

        number = number + 1
        itemCount.value = number.toString()
    }

    fun deleteNumber(){

            number = number - 1
        itemCount.value = number.toString()
    }

    fun getNumber() : LiveData<String> {

        return itemCount
    }

    fun getMessage() : MutableLiveData<String> {

        if(number == 0){

            message.value = "The item list is empty"

        }else if (number > 0) {

            message.value = "The item list contains" + " " + number.toString()+ " " + "items"

        }

        return  message
    }




    fun addItem(title: String): PlaceItem { // funkce ktera vraci newItem s parametrem title , jina moznost nebyla

        val newItem =
            PlaceItem( //newItem je promena ktera uchovava tridu items() a priraduje ke kazdemu objektu hodnotu
                title = title,
                flagImage = R.drawable.ic_czech_flag,
                height = "630m",
                speedNumber = "3",
                numberInBrackets = "5",
                unit = "m/s",
                direction = "SZ",
                kompasImage = R.drawable.ic_kompas,
                canvas = R.drawable.ic_canvas,
                jumpDirection = "V, JV, J",
                circleImage = R.drawable.ic_kruh,
                moonImage = R.drawable.ic_moon,
                celsius = "5°C",
                percent = "0%",
                cloudPressureImage = R.drawable.ic_posibility_cloud,
                possibilityToRainImage = R.drawable.ic_rainned,
                pressureImage = R.drawable.ic_preassure,
                sever = "S",
                jih = "J",
                zapad = "Z",
                vychod = "V",
                txt_cloudPreassure = "1,127m",
                txt_preassure = "1023hPa",
                txt_rainned = "0.0mm"
            )
        return newItem
    }





}