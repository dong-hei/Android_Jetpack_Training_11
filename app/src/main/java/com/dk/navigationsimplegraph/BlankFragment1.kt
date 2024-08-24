package com.dk.navigationsimplegraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class BlankFragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /**
         * 네비게이션에서 데이터 전달하는 법
         * val bundle = Bundle()
         * bundle.putString("key", "val")
         * 이 값을 보내지 않으면 null이 된다.
         * 즉 데이터를 안전하게 전달할것이면 safe args를 사용하라
         */
        val action = BlankFragment1Directions.actionBlankFragment12ToBlankFragment22("apple")
        // 데이터를 안 넘기겠다라고 해도 디폴트값으로 지정해준 값이 찍힌다 (즉 Null safe)

        val view = inflater.inflate(R.layout.fragment_blank1, container, false)
        view.findViewById<Button>(R.id.btn1).setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.action_blankFragment12_to_blankFragment22, bundle)
            Navigation.findNavController(view).navigate(action)
        }

        return view
    }

}