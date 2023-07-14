package com.example.todolist
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var addButton: Button
    private lateinit var deleteButton: Button
    private lateinit var clearButton: Button
    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private val itemList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        addButton = findViewById(R.id.addButton)
        deleteButton = findViewById(R.id.deleteButton)
        clearButton = findViewById(R.id.clearButton)
        listView = findViewById(R.id.listView)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, itemList)
        listView.adapter = adapter
    }
}
