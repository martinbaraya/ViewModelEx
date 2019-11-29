package com.example.martin.viewmodelex

import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val usd_to_can_rate =1.32f
    private var dollarText = ""
    private var result: Float = 0f

    fun setAmount(value: String) {
        this.dollarText = value
        result = value.toFloat() * usd_to_can_rate
    }

    fun getResult(): Float? {
        return result
    }

}
