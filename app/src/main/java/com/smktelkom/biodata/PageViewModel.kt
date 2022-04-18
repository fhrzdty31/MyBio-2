package com.smktelkom.biodata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {
    private val mNama = MutableLiveData<String>()
    private val mLahir = MutableLiveData<String>()
    private val mJk = MutableLiveData<String>()
    private val mAlamat = MutableLiveData<String>()
    private val mNomor = MutableLiveData<String>()
    private val mEmail = MutableLiveData<String>()

    val nama : LiveData<String>
        get() = mNama
    val lahir : LiveData<String>
        get() = mLahir
    val jk : LiveData<String>
        get() = mJk
    val alamat : LiveData<String>
        get() = mAlamat
    val nomor : LiveData<String>
        get() = mNomor
    val email : LiveData<String>
        get() = mEmail

    fun setName(nama: String) {
        mNama.value = nama
    }
    fun setLahir(lahir: String) {
        mLahir.value = lahir
    }
    fun setJk(jk: String) {
        mJk.value = jk
    }
    fun setAlamat(alamat: String) {
        mAlamat.value = alamat
    }
    fun setNomor(nomor: String) {
        mNomor.value = nomor
    }
    fun setEmail(email: String) {
        mEmail.value = email
    }
}