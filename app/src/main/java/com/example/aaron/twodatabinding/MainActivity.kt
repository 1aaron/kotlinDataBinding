package com.example.aaron.twodatabinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aaron.twodatabinding.databinding.ActivityMainBinding
import com.example.aaron.twodatabinding.observables.ExampleObservable

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding?.exampleModel = ExampleObservable(setTitle = true)
    }
}
