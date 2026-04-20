package thigk2.trandaichi_65130311;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DanhNhanActivity extends AppCompatActivity {

    RecyclerView rvDanhNhan;
    DanhNhanAdapter adapter;
    List<DanhNhan> danhNhanList;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_nhan);

        // Ánh xạ
        rvDanhNhan = findViewById(R.id.rvDanhNhan);
        btnBack = findViewById(R.id.btnBackDanhNhan);

        // 1. Tạo dữ liệu hard-code (5 danh nhân)
        danhNhanList = new ArrayList<>();
        // Sử dụng icon hệ thống tạm thời cho ảnh
        danhNhanList.add(new DanhNhan("Võ Nguyên Giáp", "Quảng Bình", android.R.drawable.ic_menu_myplaces));
        danhNhanList.add(new DanhNhan("Hồ Chí Minh", "Nghệ An", android.R.drawable.ic_menu_myplaces));
        danhNhanList.add(new DanhNhan("Trần Hưng Đạo", "Nam Định", android.R.drawable.ic_menu_myplaces));
        danhNhanList.add(new DanhNhan("Nguyễn Trãi", "Hải Dương", android.R.drawable.ic_menu_myplaces));
        danhNhanList.add(new DanhNhan("Quang Trung", "Bình Định", android.R.drawable.ic_menu_myplaces));

        // 2. Thiết lập RecyclerView
        adapter = new DanhNhanAdapter(danhNhanList);
        rvDanhNhan.setLayoutManager(new LinearLayoutManager(this));
        rvDanhNhan.setAdapter(adapter);

        // 3. Nút quay lại
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}