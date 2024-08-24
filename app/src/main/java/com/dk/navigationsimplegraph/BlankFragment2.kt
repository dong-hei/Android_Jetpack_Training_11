package com.dk.navigationsimplegraph

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class BlankFragment2 : Fragment() {

    //BlankFragment1에서 받는 데이터를 받기 위함
    val args : BlankFragment2Args by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
        val getString = arguments?.getString("key")
        Log.d("BlankFragment2", getString.toString())

        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment22_to_blankFragment3)
        }
        Log.d("BlankFragmnet", args.key)

        return view
    }

}