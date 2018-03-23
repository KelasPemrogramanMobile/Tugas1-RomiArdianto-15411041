package com.example.asus.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.etNama) EditText etNama;
    @BindView(R.id.etNPM) EditText etNPM;
    @BindView(R.id.etNilaiTugas) EditText etNilaiTugas;
    @BindView(R.id.etNilaiQuis) EditText etNilaiQuis;
    @BindView(R.id.etNilaiUTS) EditText etNilaiUTS;
    @BindView(R.id.etNilaiUAS) EditText etNilaiUAS;

    @BindView(R.id.txtHasil) EditText txtHasil;
    @BindView(R.id.txtNPM) EditText txtNPM;
    @BindView(R.id.txtNilaiQuis) EditText txtNilaiQuis;
    @BindView(R.id.txtNilaiTugas) EditText txtNilaiTugas;
    @BindView(R.id.txtNilaiUTS) EditText txtNilaiUTS;
    @BindView(R.id.txtNilaiUAS) EditText txtNilaiUAS;


    @OnClick(R.id.btnClickMe)
    void klik(){
        String nama = etNama.getText().toString();
        String npm = etNPM.getText().toString();
        String NilaiQuis = etNilaiQuis.getText().toString();
        String NilaiTugas = etNilaiTugas.getText().toString();
        String NilaiUTS = etNilaiUTS.getText().toString();
        String NilaiUAS = etNilaiUAS.getText().toString();
        String mix = nama+" "+npm+" "+NilaiQuis+""+NilaiTugas+""+NilaiUTS+""+NilaiUAS;

        Toast.makeText(getApplicationContext(),mix,Toast.LENGTH_LONG).show();
        txtHasil.setText(nama);
        txtNPM.setText(npm);
        txtNilaiQuis.setText(NilaiQuis);
        txtNilaiTugas.setText(NilaiTugas);
        txtNilaiUTS.setText(NilaiUTS);
        txtNilaiUAS.setText(NilaiUAS);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
