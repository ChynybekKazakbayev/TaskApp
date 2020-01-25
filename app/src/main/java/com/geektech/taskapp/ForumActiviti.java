package com.geektech.taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ForumActiviti extends AppCompatActivity {
    private EditText editText;
    private EditText edit_act_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum_activiti);
        editText = findViewById(R.id.Edit_Text);
        edit_act_text = findViewById(R.id.edit_act_text);
    }

    public void onClick(View view) {
        String text = editText.getText().toString().trim();
        String tex = edit_act_text.getText().toString().trim();
        Intent intent = new Intent(ForumActiviti.this,MainActivity.class);
        intent.putExtra("key", tex);
        intent.putExtra("key2", text);
        startActivity(intent);
    }

}
