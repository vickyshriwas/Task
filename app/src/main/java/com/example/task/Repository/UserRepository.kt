package com.example.task.Repository

import androidx.lifecycle.MutableLiveData
import com.example.task.Model.user
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class UserRepository {

    private val databaseReference : DatabaseReference = FirebaseDatabase.getInstance().getReference("Details")

    @Volatile private  var INSTANCE : UserRepository ?= null

            fun getInstance() : UserRepository{
                return INSTANCE ?: synchronized(this){
                    var instance = UserRepository()
                    INSTANCE = instance
                    instance
                }
            }

    fun loadUsers(userList : MutableLiveData<List<user>>){

        databaseReference.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                try{
                    var _userList : List<user> = snapshot.children.map { dataSnapshot ->
                        dataSnapshot.getValue(user::class.java)!!
                    }
                    userList.postValue(_userList)
                }catch (e : Exception){}
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })
    }
}