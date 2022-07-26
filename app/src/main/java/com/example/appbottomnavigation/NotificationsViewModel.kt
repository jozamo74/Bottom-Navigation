package com.example.appbottomnavigation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/****
 * Project: App Bottom Navigation
 * From: com.example.appbottomnavigation
 * Created by José Zambrano Moya on 17/7/22 at 19:44
 * More info: jose.zambranomoya.74@gmail.com
 ****/

class NotificationsViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment Section"
    }

    val text: LiveData<String> = _text
}