package com.dk.navigationsimplegraph

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation

class BlankFragment5 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    //Fragment 5에서 back버튼 눌렀을때 Fragment로 이동 그러니 다시 뒤로가기를 누르면 5로 간다.
//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                Log.d("BlankFragment5", "pressed")
//                view?.let{
//                    Navigation.findNavController(it).navigate(R.id.action_blankFragment5_to_blankFragment12)
//                }
//            }
//        }
//        requireActivity().onBackPressedDispatcher.addCallback(this,callback)
//    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank5, container, false)

        return view
    }

}