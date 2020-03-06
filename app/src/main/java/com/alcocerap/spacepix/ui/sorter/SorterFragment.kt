package com.alcocerap.spacepix.ui.sorter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.alcocerap.spacepix.R
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView

class SorterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_sorter, container, false)

        val imageView: SubsamplingScaleImageView = root.findViewById(R.id.image_view)

        imageView.setImage(ImageSource.resource(R.drawable.milky_way))

        return root
    }

}