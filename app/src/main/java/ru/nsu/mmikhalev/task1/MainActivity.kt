package ru.nsu.mmikhalev.task1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.nsu.mmikhalev.task1.activity.ActivityA
import ru.nsu.mmikhalev.task1.activity.ActivityB
import ru.nsu.mmikhalev.task1.activity.ActivityC
import ru.nsu.mmikhalev.task1.activity.ActivityType

class MainActivity : AppCompatActivity() {
    private val nextActivity = "nextActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nextActivity = intent.getStringExtra(nextActivity)

        when (nextActivity) {
            ActivityType.B -> goToActivity(ActivityB::class.java)
            ActivityType.C -> goToActivity(ActivityC::class.java)
            else -> goToActivity(ActivityA::class.java)
        }
    }

    private fun goToActivity(activityClass: Class<out AppCompatActivity>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
        finish()
    }
}