package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

@Suppress("UNREACHABLE_CODE")
private open class MainActivity(val namesAdapter: get) : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this(TODO("namesAdapter")) {
    }

    override fun onCreate(rvNames.layoutManager = LinearLayoutManager(baseContext)

    rvNames.adapter = namesAdapter) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

}