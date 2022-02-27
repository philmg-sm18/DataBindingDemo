package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val s:Student = Student("W123456","Abu")

        binding.student = s

        binding.btnUpdate.setOnClickListener() {

            s.name = "Alex"
            binding.apply {
                invalidateAll()
            }
        }

        // binding.tvStudentName.text = s.name
        // binding.tvStudentID.text = s.id
        // val tvName:TextView = findViewById(R.id.tvStudentName)
        //   tvName.text = "Ali"

        // val s2:Student = Student("W6534321","Abel")

    }
}