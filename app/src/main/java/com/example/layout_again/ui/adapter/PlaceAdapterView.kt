package com.example.layout_again.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.layout_again.R
import com.example.layout_again.data.PlaceItem
import com.example.layout_again.databinding.PlacesBinding
import com.mikepenz.fastadapter.binding.AbstractBindingItem

class PlaceAdapterView(val place: PlaceItem) :
    AbstractBindingItem<PlacesBinding>() { //Do promenne place vkladam tridu Place, ktera obsahuje prommenne ktere pripojim k realnym viewckum

    override val type: Int
        get() = R.id.item_places

    override fun bindView(binding: PlacesBinding, payloads: List<Any>) {

        binding.imageFlag.setImageResource(place.flagImage)
        binding.canvas.setImageResource(place.canvas)
        binding.imageMoon.setImageResource(place.moonImage)
        binding.imageKompas.setImageResource(place.kompasImage)
        binding.imageKruh.setImageResource(place.circleImage)
        binding.imageView4.setImageResource(place.pressureImage)
        binding.imageView3.setImageResource(place.cloudPressureImage)
        binding.imageView2.setImageResource(place.possibilityToRainImage)
        binding.textNazevLokace.text = place.title
        binding.textNadmorskaVyska.text = place.height
        binding.textPercent.text = place.percent
        binding.textCislo.text = place.speedNumber
        binding.textSpeed.text = place.unit
        binding.textCisloVZavorce.text = place.numberInBrackets
        binding.textSmer.text = place.direction
        binding.textCelsia.text = place.celsius
        binding.textSmerSkoku.text = place.jumpDirection
        binding.textRainned.text = place.txt_rainned
        binding.textPossibilityRain.text = place.txt_cloudPreassure
        binding.textPreassure.text = place.txt_preassure
        binding.textZapad.text = place.zapad
        binding.textJih.text = place.jih
        binding.textSever.text = place.sever
        binding.textVychod.text = place.vychod
    }

    override fun createBinding(inflater: LayoutInflater, parent: ViewGroup?): PlacesBinding {
        return PlacesBinding.inflate(inflater, parent, false)
    }

}