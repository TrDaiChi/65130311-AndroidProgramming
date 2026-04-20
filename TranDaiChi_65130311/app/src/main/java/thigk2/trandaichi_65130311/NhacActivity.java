package thigk2.trandaichi_65130311;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NhacActivity extends AppCompatActivity {

    ListView lvBaiHat;
    Button btnBack;
    ArrayList<String> dsBaiHat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhac);

        // Ánh xạ View
        lvBaiHat = findViewById(R.id.lvBaiHat);
        btnBack = findViewById(R.id.btnBackNhac);

        // 1. Tạo dữ liệu 10 bài hát
        dsBaiHat = new ArrayList<>();
        dsBaiHat.add("Sơn Tùng M-TP - Đừng làm trái tim anh đau");
        dsBaiHat.add("HIEUTHUHAI - Ngủ một mình");
        dsBaiHat.add("Đen Vâu - Nấu cơm cho em");
        dsBaiHat.add("Vũ - Lạ lùng");
        dsBaiHat.add("Thịnh Suy - Một đêm say");
        dsBaiHat.add("Hoàng Thùy Linh - See Tình");
        dsBaiHat.add("Mono - Waiting For You");
        dsBaiHat.add("Jack - Ngôi sao cô đơn");
        dsBaiHat.add("Phan Mạnh Quỳnh - Có chàng trai viết lên cây");
        dsBaiHat.add("Trần Đại Chí - Bài hát đặc biệt");

        // 2. Thiết lập Adapter (Sử dụng layout item_nhac.xml đã tạo)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.item_nhac,
                R.id.tvTenBaiHat,
                dsBaiHat
        );

        lvBaiHat.setAdapter(adapter);

        // 3. Nút quay lại
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}