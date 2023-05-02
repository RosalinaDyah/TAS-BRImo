package edu.uksw.fti.pam.pam_activityintent.models

import com.google.gson.annotations.SerializedName

data class TodosModel(
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("pin")
    var pin: String,

)