package net.madran.bby261.maindetail;

//Kullanılan Kütüphaneler

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    //Oluşturulan Değişkenler

    private TextView detayText;

    private String[] detayListe;

    private String pozisyonAnahtari = "pozisyonAnahtari";

    private int detayPozisyon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detayText = (TextView) findViewById(R.id.detailTextView);

        detayListe = new String[] { "Detay 1", "Detay 2", "Detay 3", "Detay 4", "Detay 5"};


        detayPozisyon = getIntent().getIntExtra(pozisyonAnahtari, -1);


        if (detayPozisyon == -1) {
            Toast.makeText(DetailActivity.this, "Hata Var!", Toast.LENGTH_LONG).show();
        } else {
            detayText.setText(detayListe[detayPozisyon]);
        }

    }
}