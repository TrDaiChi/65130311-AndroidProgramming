package thigk2.trandaichi_65130311;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class TienActivity extends AppCompatActivity {

    EditText edtTien;
    Button btnDoiTien, btnBackTien;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tien);

        // Ánh xạ View
        findViews();

        // Xử lý sự kiện đổi tiền
        btnDoiTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiTien();
            }
        });

        // Nút quay lại
        btnBackTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void findViews() {
        edtTien = findViewById(R.id.edtTien);
        btnDoiTien = findViewById(R.id.btnDoiTien);
        btnBackTien = findViewById(R.id.btnBackTien);
        tvKetQua = findViewById(R.id.tvKetQua);
    }

    private void doiTien() {
        String input = edtTien.getText().toString().trim();

        // 1. Kiểm tra rỗng
        if (input.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập số tiền!", Toast.LENGTH_SHORT).show();
            edtTien.setError("Không được để trống");
            return;
        }

        try {
            double vnd = Double.parseDouble(input);
            double tiGia = 25000.0;
            double usd = vnd / tiGia;

            String result = String.format(Locale.getDefault(), "Kết quả: %.2f USD", usd);
            tvKetQua.setText(result);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Số tiền không hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}