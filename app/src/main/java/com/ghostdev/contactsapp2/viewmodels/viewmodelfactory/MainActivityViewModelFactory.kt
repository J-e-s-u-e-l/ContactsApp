package com.ghostdev.contactsapp2.viewmodels.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ghostdev.contactsapp2.repo.ContactsRepo
import com.ghostdev.contactsapp2.viewmodels.MainActivityViewModel

class MainActivityViewModelFactory(private val contactsRepo: ContactsRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(contactsRepo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}