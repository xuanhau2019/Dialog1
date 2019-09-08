package com.example.dialog1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_KetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_KetQua=findViewById(R.id.tv_KetQua);

        AlertDialog.Builder mydialog= new AlertDialog.Builder(this);
        mydialog.setIcon(R.drawable.instagram);
        mydialog.setTitle("TieuDe");
//        mydialog.setMessage("NoiDung");
        final CharSequence[] items={"xanh","do","vang"};
//        mydialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                tv_KetQua.setText("SuKienSauKhiNhan");
//
//            }
//        });
        mydialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tv_KetQua.setText(items[i].toString());
            }
        });
    AlertDialog alertDialog= mydialog.create();
    alertDialog.show();
    }
}
