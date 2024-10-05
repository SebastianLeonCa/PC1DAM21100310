package com.example.pc1_dam_21100310

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PlayerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_listado, container, false)

        val rvPlayer: RecyclerView = view.findViewById(R.id.recyclerView2)
        rvPlayer.layoutManager = LinearLayoutManager(requireContext())
        rvPlayer.adapter = PlayerAdapter(getPlayer())

        return view
    }

    private fun getPlayer(): List<PlayerModel>{
        val lstPlayer: ArrayList<PlayerModel> = ArrayList()

        lstPlayer.add(
            SongModel(1, R.drawable.veranosinti, "Neverita"
                , "Un Verano Sin Ti", "100.000"
                , "4.23"))

        lstPlayer.add(
            SongModel(2, R.drawable.cas, "Sunsetz"
                , "Sunsetz", "120.000"
                , "3.26"))

        lstPlayer.add(
            SongModel(3, R.drawable.lastdinnerparty, "Sinner"
                , "Last dinner party", "81.000"
                , "4.43"))

        return lstPlayer
    }
}