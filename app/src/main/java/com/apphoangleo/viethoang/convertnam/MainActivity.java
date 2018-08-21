package com.apphoangleo.viethoang.convertnam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtdl, txtal;
    Button btnchuyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtdl = (EditText) findViewById(R.id.txtdl);
        txtal = (EditText) findViewById(R.id.txtal);
        btnchuyen = (Button) findViewById(R.id.btnchuyen);
        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int namduong = Integer.parseInt(txtdl.getText()+"");
                String can = can(namduong%10);
                String chi = chi(namduong%12);
                txtal.setText(can + " " + chi);
            }
        });

    }
    public String can(int chon){
        switch (chon){
            case 0: return "Canh";
            case 1: return "Tân";
            case 2: return "Nhâm";
            case 3: return "Quý";
            case 4: return "Giáp";
            case 5: return "Ất";
            case 6: return "Bính";
            case 7: return "Đinh";
            case 8: return "Mậu";
            case 9: return "Kỷ";
        }
        return "0";
    }
    public String chi(int chon){
        switch (chon){
            case 0: return "Thân";
            case 1: return "Dậu";
            case 2: return "Tuất";
            case 3: return "Hợi";
            case 4: return "Tý";
            case 5: return "Sửu";
            case 6: return "Dần";
            case 7: return "Mẹo";
            case 8: return "Thìn";
            case 9: return "Tỵ";
            case 10: return "Ngọ";
            case 11: return "Mùi";
        }
        return "0";
    }
}
