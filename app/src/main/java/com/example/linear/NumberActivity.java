package com.example.linear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumberActivity extends AppCompatActivity {

    ListView listViewNumber;
    WordAdapter wordAdapter;
    List<Words> wordlist;
    TextView textViewNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
    listViewNumber=findViewById(R.id.word_view);
    //textViewNumber=findViewById(R.id.text_view_number);

        wordlist=new ArrayList<>();
        wordlist.add(new Words("Akenge","One",R.drawable.ic_launcher_background));
        wordlist.add(new Words("Aeng","Two"));
        wordlist.add(new Words("Somok","Three"));
        wordlist.add(new Words("Ang'wan","Four"));
        wordlist.add(new Words("Muut","Five"));
        wordlist.add(new Words("loh","Six"));
        wordlist.add(new Words("Tisab","Seven"));
        wordlist.add(new Words("Sisit","Eight"));
        wordlist.add(new Words("Sogol","Nine"));
        wordlist.add(new Words("Taman","Ten"));
        wordlist.add(new Words("Taman Akenge","Eleven"));
        wordlist.add(new Words("Taman ak aeng","Twelve"));
        wordlist.add(new Words("Taman ak somok","Thirteen"));
        wordlist.add(new Words("Taman ak Ang'wan","Forteen"));
        wordlist.add(new Words("Taman ak mut","Fifteen"));

        wordAdapter=new WordAdapter(this,wordlist);
        listViewNumber.setAdapter(wordAdapter);

    }
}
