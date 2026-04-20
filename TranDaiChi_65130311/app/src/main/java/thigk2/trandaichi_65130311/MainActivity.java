package thigk2.trandaichi_65130311;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnCN1, btnCN2, btnCN3, btnCN4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm Id cho các button
        findViews();

        // Thiết lập sự kiện click
        btnCN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TienActivity.class);
                startActivity(i);
            }
        });

        btnCN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NhacActivity.class);
                startActivity(i);
            }
        });

        btnCN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DanhNhanActivity.class);
                startActivity(i);
            }
        });

        btnCN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThongTinActivity.class);
                startActivity(i);
            }
        });
    }

    private void findViews() {
        btnCN1 = findViewById(R.id.btnChucNang1);
        btnCN2 = findViewById(R.id.btnChucNang2);
        btnCN3 = findViewById(R.id.btnChucNang3);
        btnCN4 = findViewById(R.id.btnChucNang4);
    }
}