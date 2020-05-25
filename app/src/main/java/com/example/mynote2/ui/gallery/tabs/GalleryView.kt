package com.example.mynote2.ui.gallery.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mynote2.R
import kotlinx.android.synthetic.main.fragment_gallery_view.*
import java.text.FieldPosition

/**
 * A simple [Fragment] subclass.
 */
class GalleryView : Fragment() {
    var position = 1

    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(sectionNumber: Int): GalleryView {
            return GalleryView().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        position = arguments?.getInt(ARG_SECTION_NUMBER) ?: 1
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_gallery_view, container, false)
        txt_gallery_view.text = position.toString()

        return root
    }

}
