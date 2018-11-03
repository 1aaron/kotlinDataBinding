package com.example.aaron.twodatabinding.observables

import android.databinding.BaseObservable

class ExampleObservable(val setTitle: Boolean): BaseObservable() {
    //no need of @Bindable
    var oneWayText: String? = null
        get() = if (setTitle) "ONE WAY BINDING" else ""
    var twoWayModifiedText: String? = "something"

    var twoWayText: String? = null
    set(value) {
        field = value
        twoWayModifiedText = value?.chunked(1)?.joinToString("-") ?: ""
        notifyChange()
        //notifyPropertyChanged(BR.twoWayModifiedText)
    }
}