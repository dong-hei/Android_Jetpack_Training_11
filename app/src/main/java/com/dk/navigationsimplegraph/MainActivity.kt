package com.dk.navigationsimplegraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * 1 -> 2 -> 3 -> 4 -> 5 -> backbutton -> 1
 *
 * Animation
 * 첫번째 Fragment A / 두번째 Fragment B
 * enterAnim A->B로 갈때 B가 보이는 방식
 * exitAnim A->B로 갈때 A가 사라지는 방식
 * popEnterAnim 뒤로가기로 B->A로 올때 A가 나타나는 방식
 * popExitAnim 뒤로가기로 B->A로 올때 B가 사라지는 방식
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}