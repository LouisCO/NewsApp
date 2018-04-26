package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News>articles) {
        super(context, 0, articles);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView=convertView;
        if (listItemView == null) {
            listItemView=LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextView title=listItemView.findViewById(R.id.title);
        TextView author=listItemView.findViewById(R.id.author);
        TextView section=listItemView.findViewById(R.id.section);
        TextView date=listItemView.findViewById(R.id.date);

        News article=getItem(position);

            //String dateInString=article.getDate();
            title.setText(article.getTitle());
            author.setText(article.getAuthor());
            section.setText(article.getSection());
            date.setText(article.getDate());

        return listItemView;
    }
    /**
     * Return the formatted date string (i.e. "24 Apr 2018") from a Date object.

    private String formatDate(String dateInString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        return dateFormat.format(dateInString);
    }*/

}
