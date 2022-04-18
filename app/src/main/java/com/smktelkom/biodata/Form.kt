package com.smktelkom.biodata

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText

class Form : Fragment() {
    private var pageViewModel: PageViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val setNama = view.findViewById<TextInputEditText>(R.id.setNama)
        val setLahir = view.findViewById<TextInputEditText>(R.id.setLahir)
        val setJk = view.findViewById<TextInputEditText>(R.id.setJk)
        val setAlamat = view.findViewById<TextInputEditText>(R.id.setAlamat)
        val setNomor = view.findViewById<TextInputEditText>(R.id.setNomor)
        val setEmail = view.findViewById<TextInputEditText>(R.id.setEmail)

        setNama.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {}
                override fun onTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {
                    pageViewModel!!.setName(char.toString())
                }
                override fun afterTextChanged(edt: Editable?) {}
            }
        )
        setLahir.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {}
                override fun onTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {
                    pageViewModel!!.setLahir(char.toString())
                }
                override fun afterTextChanged(edt: Editable?) {}
            }
        )
        setJk.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {}
                override fun onTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {
                    pageViewModel!!.setJk(char.toString())
                }
                override fun afterTextChanged(edt: Editable?) {}
            }
        )
        setAlamat.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {}
                override fun onTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {
                    pageViewModel!!.setAlamat(char.toString())
                }
                override fun afterTextChanged(edt: Editable?) {}
            }
        )
        setNomor.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {}
                override fun onTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {
                    pageViewModel!!.setNomor(char.toString())
                }
                override fun afterTextChanged(edt: Editable?) {}
            }
        )
        setEmail.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {}
                override fun onTextChanged(char: CharSequence, i: Int, i1: Int, i2: Int) {
                    pageViewModel!!.setEmail(char.toString())
                }
                override fun afterTextChanged(edt: Editable?) {}
            }
        )
    }

    companion object {
        fun newInstance(): Form {
            return Form()
        }
    }
}