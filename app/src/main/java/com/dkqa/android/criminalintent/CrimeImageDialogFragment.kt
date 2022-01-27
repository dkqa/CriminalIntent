package com.dkqa.android.criminalintent

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.DialogFragment

private const val ARG_IMAGE_PATH = "image_path"

class CrimeImageDialogFragment : DialogFragment() {

    private lateinit var bitmap: Bitmap

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val uri = arguments?.getString(ARG_IMAGE_PATH) as String
        bitmap = BitmapFactory.decodeFile(uri)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dialog_crime_image, container, false)
        imageView = view.findViewById(R.id.dialog_image)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView.setImageBitmap(bitmap)

    }

    companion object {
        fun newInstance(path: String): CrimeImageDialogFragment {
            val args = Bundle().apply {
                putString(ARG_IMAGE_PATH, path)
            }
            return CrimeImageDialogFragment().apply {
                arguments = args
            }
        }
    }

}