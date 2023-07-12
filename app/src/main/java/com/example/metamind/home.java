package com.example.metamind;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<CardViewItem> dataList;
    private EditText searchEditText;
    Button cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cat = findViewById(R.id.btn2);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),category.class);
                startActivity(i1);
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        searchEditText = findViewById(R.id.searchEditText);

        // Create a list of CardViewItem objects with image, title, description, and activity class
        dataList = new ArrayList<>();
        dataList.add(new CardViewItem(R.drawable.card1, "Goat Chat", "text copywriting SEO writing`", card1.class));
        dataList.add(new CardViewItem(R.drawable.card2, "FileChat", "email assistant copywriting", card2.class));
        dataList.add(new CardViewItem(R.drawable.card3, "ChatBa", "productivity email text", card3.class));
        dataList.add(new CardViewItem(R.drawable.card4, "Ask MY Book", "general writing productivity", card4.class));
        dataList.add(new CardViewItem(R.drawable.card5, "AI Judge", "story teller presentation startup start-up tools ppt", card5.class));
        dataList.add(new CardViewItem(R.drawable.card6, "Studio AI", "general writing memory highlighting reads", card6.class));
        dataList.add(new CardViewItem(R.drawable.card7, "Glimmer AI", "image editng avatars", card7.class));
        dataList.add(new CardViewItem(R.drawable.card8, "Spline", "art designing", card8.class));
        dataList.add(new CardViewItem(R.drawable.card9, "Auto Draw", "image editing", card9.class));
        dataList.add(new CardViewItem(R.drawable.card10, "Slides AI", "designing", card10.class));
        dataList.add(new CardViewItem(R.drawable.card11, "CreativeFabrica", "image generator developer", card11.class));
        dataList.add(new CardViewItem(R.drawable.card12, "WiziShop", "image generator developer fun drawing image", card12.class));
        dataList.add(new CardViewItem(R.drawable.card13, "ArtShops", "personalized videos education assistant", card13.class));
        dataList.add(new CardViewItem(R.drawable.card14, "SellarAI", "video editing social media gaming", card14.class));
        dataList.add(new CardViewItem(R.drawable.card15, "Forthewall", "video editing social media", card15.class));
        dataList.add(new CardViewItem(R.drawable.card16, "Monica", "video editing text to speech", card16.class));
        dataList.add(new CardViewItem(R.drawable.card17, "Jenni", "avatars video generator", card17.class));
        dataList.add(new CardViewItem(R.drawable.card18, "HeyFriday", "audio editing productivity", card18.class));
        dataList.add(new CardViewItem(R.drawable.card19, "Caktus", "audio editing podcast video producer text to speech", card19.class));
        dataList.add(new CardViewItem(R.drawable.card20, "InputAi", "audio text to speech", card20.class));
        dataList.add(new CardViewItem(R.drawable.card21, "Looka", "music ", card21.class));
        dataList.add(new CardViewItem(R.drawable.card22, "MakeLogo", "music", card22.class));
        dataList.add(new CardViewItem(R.drawable.card23, "BrandMark", "music", card23.class));
        dataList.add(new CardViewItem(R.drawable.card24, "StockImg", "code assitant", card24.class));
        dataList.add(new CardViewItem(R.drawable.card25, "Seek", "code developer tools low code low-code no code no-code", card25.class));
        dataList.add(new CardViewItem(R.drawable.card26, "Jigso", "code developer tools", card26.class));
        dataList.add(new CardViewItem(R.drawable.card27, "CoGram", "code", card27.class));
        dataList.add(new CardViewItem(R.drawable.card28, "CodeConverter", "SQL", card28.class));
        dataList.add(new CardViewItem(R.drawable.card29, "BookMark", "3D", card29.class));
        dataList.add(new CardViewItem(R.drawable.card30, "Tabnine", "3D designing models texture", card30.class));
        dataList.add(new CardViewItem(R.drawable.card31, "Rose", "3D real estate home design house design", card31.class));
        dataList.add(new CardViewItem(R.drawable.card32, "FireFiles", "e-commerce e commerce", card32.class));
        dataList.add(new CardViewItem(R.drawable.card33, "DeBuild", "e-commerce e commerce life ", card33.class));
        dataList.add(new CardViewItem(R.drawable.card34, "AiQuery", "education memory", card34.class));
        dataList.add(new CardViewItem(R.drawable.card35, "TimeMaster", "education research", card35.class));
        dataList.add(new CardViewItem(R.drawable.card36, "Text-To-Speech", "legal education research", card36.class));
        dataList.add(new CardViewItem(R.drawable.card37, "FakeYou", "SEO education", card37.class));
        dataList.add(new CardViewItem(R.drawable.card38, "Boo", "SEO education", card38.class));
        dataList.add(new CardViewItem(R.drawable.card39, "Lovo", "SEO education", card39.class));
        dataList.add(new CardViewItem(R.drawable.card40, "Resemble", "SEO education", card40.class));
        dataList.add(new CardViewItem(R.drawable.card41, "EcrettMusic", "SEO education", card41.class));
        dataList.add(new CardViewItem(R.drawable.card42, "Boomy", "SEO education", card42.class));
        dataList.add(new CardViewItem(R.drawable.card43, "Aiva", "SEO education", card43.class));
        dataList.add(new CardViewItem(R.drawable.card44, "BeatBot", "SEO education", card44.class));
        dataList.add(new CardViewItem(R.drawable.card45, "SoundDraw", "SEO education", card45.class));
        dataList.add(new CardViewItem(R.drawable.card46, "ShareHouse", "SEO education", card46.class));
        dataList.add(new CardViewItem(R.drawable.card47, "Perplexity", "SEO education", card47.class));
        dataList.add(new CardViewItem(R.drawable.card48, "Askstockgpt", "SEO education", card48.class));
        dataList.add(new CardViewItem(R.drawable.card49, "ChatGPT", "SEO education", card49.class));
        dataList.add(new CardViewItem(R.drawable.card50, "RapidReply", "SEO education", card50.class));

        // Add more items as needed

        adapter = new RecyclerViewAdapter(dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Add a text change listener to the searchEditText
        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Call a method to filter the data based on the search query
                filterData(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    private void filterData(String query) {
        List<CardViewItem> filteredList = new ArrayList<>();
        for (CardViewItem item : dataList) {
            if (item.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    item.getDescription().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(item);
            }
        }
        adapter.setData(filteredList);
    }

    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

        private List<CardViewItem> dataList;

        public RecyclerViewAdapter(List<CardViewItem> dataList) {
            this.dataList = dataList;
        }

        public void setData(List<CardViewItem> dataList) {
            this.dataList = dataList;
            notifyDataSetChanged();
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final CardViewItem item = dataList.get(position);
            holder.imageView.setImageResource(item.getImageResource());
            holder.titleTextView.setText(item.getTitle());
            holder.descriptionTextView.setText(item.getDescription());

            // Set click listener for the card view
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Launch the respective activity based on the card clicked
                    Intent intent = new Intent(home.this, item.getActivityClass());
                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            CardView cardView;
            ImageView imageView;
            TextView titleTextView;
            TextView descriptionTextView;

            ViewHolder(View itemView) {
                super(itemView);
                cardView = itemView.findViewById(R.id.card_view);
                imageView = itemView.findViewById(R.id.imageView);
                titleTextView = itemView.findViewById(R.id.titleTextView);
                descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            }
        }
    }
}