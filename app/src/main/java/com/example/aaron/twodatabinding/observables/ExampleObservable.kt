package com.example.aaron.twodatabinding.observables

import android.databinding.BaseObservable

class ExampleObservable(val setTitle: Boolean): BaseObservable() {
    //no need of @Bindable
    var oneWayText: String? = null
        get() = if (setTitle) "ONE WAY BINDING" else ""
}