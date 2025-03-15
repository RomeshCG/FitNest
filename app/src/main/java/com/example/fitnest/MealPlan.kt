package com.example.fitnest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.viewModels

class MealPlan : Fragment() {

    companion object {
        fun newInstance() = MealPlan()
    }

    private val viewModel: MealPlanViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_meal_plan, container, false)

        // Find the ImageView
        val mealPlan1Image = view.findViewById<ImageView>(R.id.mealPlan1Image)

        // Set OnClickListener
        mealPlan1Image.setOnClickListener {
            // Redirect to MealPlanActivity
            val intent = Intent(activity, MealPlanSample::class.java)
            startActivity(intent)
        }

        return view
    }
}