package com.ghostdev.contactsapp2.viewmodels

import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ghostdev.contactsapp2.models.ContactsModel
import com.ghostdev.contactsapp2.repo.ContactsRepo
import kotlinx.coroutines.launch

class EditContactViewModel(private val contactsRepo: ContactsRepo): ViewModel(), Observable {

    val contact = MutableLiveData<ContactsModel>()


    fun getContact(id: Int) {
        viewModelScope.launch {
            contact.value = contactsRepo.getContact(id)
        }
    }

    fun updateContact(contact: ContactsModel) {
        viewModelScope.launch {
            contactsRepo.editContact(contact)
        }
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }
}