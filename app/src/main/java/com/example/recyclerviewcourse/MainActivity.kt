package com.example.recyclerviewcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewcourse.adapter.ItemAdapter
import com.example.recyclerviewcourse.data.DataSource
import com.example.recyclerviewcourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myDateset = DataSource().loadAffirmation()
        adapter = ItemAdapter(this,myDateset)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = adapter

    }
}