package com.ghostdev.contactsapp2.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ghostdev.contactsapp2.models.ContactsModel
import com.ghostdev.contactsapp2.repo.ContactsRepo
import kotlinx.coroutines.launch

class AddContactViewModel(private val contactsRepo: ContactsRepo): ViewModel() {

    fun addContact(contact: ContactsModel) {
        viewModelScope.launch {
            contactsRepo.addContact(contact)
        }
    }
}