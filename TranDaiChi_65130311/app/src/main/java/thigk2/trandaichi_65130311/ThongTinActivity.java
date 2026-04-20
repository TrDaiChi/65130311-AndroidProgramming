package thigk2.trandaichi_65130311;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThongTinActivity extends AppCompatActivity {

    ImageView imgAvatar;
    TextView tvHoTen, tvMSV, tvLop, tvDiaChi;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin);
        imgAvatar = findViewById(R.id.imgAvatar);
        tvHoTen = findViewById(R.id.tvHoTen);
        tvMSV = findViewById(R.id.tvMSV);
        tvLop = findViewById(R.id.tvLop);
        tvDiaChi = findViewById(R.id.tvDiaChi);
        btnBack = findViewById(R.id.btnBackThongTin);
        hienThiThongTin();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void hienThiThongTin() {
        tvHoTen.setText("Họ tên: Trần Đại Chí");
        tvMSV.setText("Mã sinh viên: 65130311");
        tvLop.setText("Lớp: 65.CNTT-2");
        tvDiaChi.setText("Địa chỉ: Nha Trang, Khánh Hòa");
        imgAvatar.setImageResource(R.drawable.tdc);
    }
}