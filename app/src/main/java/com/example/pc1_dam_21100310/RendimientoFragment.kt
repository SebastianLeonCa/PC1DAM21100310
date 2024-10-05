package com.example.pc1_dam_21100310

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView

class RendimientoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.nav_rendimiento, container, false)

        val btcalcular: Button = view.findViewById(R.id.btn_calcular)
        val etkm: EditText = view.findViewById(R.id.et_km)
        val etmin: EditText = view.findViewById(R.id.et_min)
        val tvresult: TextView = view.findViewById(R.id.tv_result)

        btcalcular.setOnClickListener
        run {
            val resultado = etkm / etmin
            tvresult = resultado
        }

    }

}