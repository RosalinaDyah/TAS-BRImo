package edu.uksw.fti.pam.pam_activityintent.models

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


class DataViewModel: ViewModel(){
    val state = mutableStateOf(UserModel())


    init {
        getData()
    }

    private fun getData(){
        viewModelScope.launch {
            state.value = getDataFormFireStore()
        }
    }
}

suspend fun getDataFormFireStore():UserModel{
    val db = FirebaseFirestore.getInstance()
    var usermodel = UserModel()

    try {
        db.collection("users").get().await().map {
            val result =    it.toObject(UserModel::class.java)
            usermodel = result
        }
    }catch (e: FirebaseFirestoreException){
        Log.d("error", "getDataFormFireStore: $e")
    }

    return usermodel
}