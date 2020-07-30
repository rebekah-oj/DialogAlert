package com.me.dialogalert

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowAlert(view: View) {
        val myAlertBuilder: android.app.AlertDialog.Builder =
            android.app.AlertDialog.Builder(this@MainActivity)
        // Set the dialog title and message.
        myAlertBuilder.setTitle("Alert")
        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop:")
        // Add the dialog buttons.

        // Add the dialog buttons.
        myAlertBuilder.setPositiveButton(
            "OK"
        ) { _, _ -> // User clicked OK button.
            Toast.makeText(
                applicationContext, "Pressed OK",
                Toast.LENGTH_SHORT
            ).show()
        }
        myAlertBuilder.setNegativeButton(
            "Cancel"
        ) { _, _ -> // User cancelled the dialog.
            Toast.makeText(
                applicationContext, "Pressed Cancel",
                Toast.LENGTH_SHORT
            ).show()
        }
        // Create and show the AlertDialog.
        myAlertBuilder.show()
    }
}