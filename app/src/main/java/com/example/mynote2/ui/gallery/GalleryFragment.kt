package com.example.mynote2.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mynote2.R
import kotlinx.android.synthetic.main.fragment_gallery.*


class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recycler_gallery.layoutManager = layoutManager
        val myAdapter = GalleryAdapter()
        recycler_gallery.adapter = myAdapter
    }
}
