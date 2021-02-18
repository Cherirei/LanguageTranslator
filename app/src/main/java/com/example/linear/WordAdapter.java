package com.example.linear;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends BaseAdapter {
    Context context;
    List<Words>wordList;
    String englishWorddb,kiswahiliWorddb;
    int imagedb;

    public WordAdapter(Context context, List<Words> wordList) {
        this.context = context;
        this.wordList = wordList;
    }

    @Override
    public int getCount() {
        return wordList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        ImageView image=convertView.findViewById(R.id.image);
        TextView englishWord=convertView.findViewById(R.id.english);
        TextView kalenjinWord=convertView.findViewById(R.id.kalenjin);

        image.setImageDrawable(wordList.get(position).getImage());
        englishWord.setText(wordList.get(position).getEnglish_word());
        kalenjinWord.setText(wordList.get(position).getKalenjin_word());
        return convertView;
    }
}
