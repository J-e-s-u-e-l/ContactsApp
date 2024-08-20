package com.ghostdev.contactsapp2.viewmodels.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ghostdev.contactsapp2.repo.ContactsRepo
import com.ghostdev.contactsapp2.viewmodels.EditContactViewModel

class EditContactViewModelFactory(private val contactsRepo: ContactsRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EditContactViewModel::class.java)) {
            return EditContactViewModel(contactsRepo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}