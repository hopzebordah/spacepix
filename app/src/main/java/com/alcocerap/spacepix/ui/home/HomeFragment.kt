package com.alcocerap.spacepix.ui.home

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import com.alcocerap.spacepix.R
import com.davemorrissey.labs.subscaleview.ImageSource

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val textView: TextView = root.findViewById(R.id.text_home)

        val imageView: SubsamplingScaleImageView = root.findViewById(R.id.image_view)

        textView.text = resources.getString(R.string.fake_timestamp)

        imageView.setImage(ImageSource.resource(R.drawable.milky_way))

        return root
    }
}
