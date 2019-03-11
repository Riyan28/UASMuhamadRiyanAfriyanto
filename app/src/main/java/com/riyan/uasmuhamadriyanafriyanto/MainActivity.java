package com.riyan.uasmuhamadriyanafriyanto;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final Button Simpan = (Button) findViewById(R.id.btSimpan);
        final Button Kosong = (Button) findViewById(R.id.btKosong);
        final EditText Nama = (EditText) findViewById(R.id.et_nama);
        final EditText Email = (EditText) findViewById(R.id.et_email);


        Simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View parentView = findViewById(R.id.main_layout_id);
                String pesan = "DATA TERSIMPAN";

                final Snackbar snackbar = Snackbar
                     .make(parentView, pesan, Snackbar.LENGTH_LONG );
                snackbar.show();
            }
        });

        Kosong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nama.setText("");
                Email.setText("");
            }
        });
    }


        public boolean onCreateOptionMenu(Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu_action_bar, menu);
            return super.onCreateOptionsMenu(menu);
        }
}