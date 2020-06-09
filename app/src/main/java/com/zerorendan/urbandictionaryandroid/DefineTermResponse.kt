package com.zerorendan.urbandictionaryandroid

import com.google.gson.annotations.SerializedName

//Struct like
data class DefineTermResponse(
    @SerializedName("list")
    val terms: List<Term>
)