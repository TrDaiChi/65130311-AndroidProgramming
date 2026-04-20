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

        rvDanhNhan = findViewById(R.id.rvDanhNhan);
        btnBack = findViewById(R.id.btnBackDanhNhan);

        danhNhanList = new ArrayList<>();
        danhNhanList.add(new DanhNhan("Võ Nguyên Giáp", "Quảng Bình", R.drawable.img));
        danhNhanList.add(new DanhNhan("Hồ Chí Minh", "Nghệ An", R.drawable.img_1));
        danhNhanList.add(new DanhNhan("Trần Hưng Đạo", "Nam Định",R.drawable.img_2));
        danhNhanList.add(new DanhNhan("Nguyễn Trãi", "Hải Dương", R.drawable.img_3));
        danhNhanList.add(new DanhNhan("Quang Trung", "Bình Định", R.drawable.img_4));

        adapter = new DanhNhanAdapter(danhNhanList);
        rvDanhNhan.setLayoutManager(new LinearLayoutManager(this));
        rvDanhNhan.setAdapter(adapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}