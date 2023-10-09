package com.example.task.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.task.Repository.UserRepository

class UserViewModel : ViewModel() {

    private val repository : UserRepository
    private val _allUsers = MutableLiveData<List<user>>()
    val allUsers : LiveData<List<user>> = _allUsers


    init {
        repository = UserRepository().getInstance()
        repository.loadUsers(_allUsers)

    }

}