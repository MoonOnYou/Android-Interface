package com.onyou.android.aninterface

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : Fragment() {
    private var mainActivity : MainActivity? = MainActivity()
    var interfaceTest : InputToast? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = (MainActivity())
    }

    override fun onDetach() {
        super.onDetach()
        mainActivity = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val btn = view.findViewById<TextView>(R.id.textViewConfirm)

           btn.setOnClickListener {
               interfaceTest?.toastWithInput(editTextInPut.text.toString())
           }

        return view
    }

}

interface InputToast{
    fun toastWithInput(text: String)
}
