package com.muflihundev.recipeapp.ui.detail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.muflihundev.recipeapp.R;

public class DetailActivity extends AppCompatActivity {
    TextView tvNamaResep,tvDetail;
    ImageView imageResep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail Resep");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvNamaResep = findViewById(R.id.tv_nama_resep);
        tvDetail = findViewById(R.id.tv_detail_resep);
        imageResep = findViewById(R.id.img_resep);

        tvNamaResep.setText(getIntent().getStringExtra("NamaResep"));
        tvDetail.setText(getIntent().getStringExtra("Detail"));
        Glide.with(this).load(getIntent().getStringExtra("Gambar"))
                .into(imageResep);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}