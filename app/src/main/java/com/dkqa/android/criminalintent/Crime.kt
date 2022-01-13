package com.dkqa.android.criminalintent

import java.util.*

class Crime(val id: UUID = UUID.randomUUID(),
            var title: String = "",
            var date: Date = Date(),
            var isSolved: Boolean = false,
            val requiresPolice: Boolean = Random().nextBoolean()) {

}