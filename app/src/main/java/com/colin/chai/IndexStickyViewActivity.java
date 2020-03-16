package com.colin.chai;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class IndexStickyViewActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_sticky_view);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
    }

    @OnClick({R.id.btnContact, R.id.btnCity})
    public void onClick(View view) {
        if(view.getId() == R.id.btnCity) {
            startActivity(new Intent(this, CityActivity.class));
        } else {
            startActivity(new Intent(this, ContactActivity.class));
        }
    }
}
