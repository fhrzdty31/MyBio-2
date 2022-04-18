package com.smktelkom.biodata

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [Screen.newInstance] factory method to
 * create an instance of this fragment.
 */
class Screen : Fragment() {
    private var pageViewModel: PageViewModel? = null
    private var tvNama: TextView? = null
    private var tvLahir: TextView? = null
    private var tvJk: TextView? = null
    private var tvAlamat: TextView? = null
    private var tvNomor: TextView? = null
    private var tvEmail: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvNama = view.findViewById(R.id.tvNama)
        tvLahir = view.findViewById(R.id.tvLahir)
        tvJk = view.findViewById(R.id.tvJk)
        tvAlamat = view.findViewById(R.id.tvAlamat)
        tvNomor = view.findViewById(R.id.tvNomor)
        tvEmail = view.findViewById(R.id.tvEmail)

        pageViewModel!!.nama.observe(requireActivity(),
            Observer { s -> tvNama!!.text = "Nama :\n\t\t $s" })
        pageViewModel!!.lahir.observe(requireActivity(),
            Observer { s -> tvLahir!!.text = "Tempat Tanggal Lahir :\n\t\t $s" })
        pageViewModel!!.jk.observe(requireActivity(),
            Observer { s -> tvJk!!.text = "Jenis Keamin :\n\t\t $s" })
        pageViewModel!!.alamat.observe(requireActivity(),
            Observer { s -> tvAlamat!!.text = "Alamat :\n\t\t $s" })
        pageViewModel!!.nomor.observe(requireActivity(),
            Observer { s -> tvNomor!!.text = "Nomor Telepon :\n\t\t $s" })
        pageViewModel!!.email.observe(requireActivity(),
            Observer { s -> tvEmail!!.text = "Email :\n\t\t $s" })
    }

    companion object {
        fun newInstance(): Screen {
            return Screen()
        }
    }
}