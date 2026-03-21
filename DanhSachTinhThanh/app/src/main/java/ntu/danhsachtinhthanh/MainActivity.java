package ntu.danhsachtinhthanh;

import android.app.ComponentCaller;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hiển thị dữ liệu lên listview
        //b1+: cần có dữ liệu

        dsTenTinhThanhVN = new ArrayList<String>();//tạo thể hiện cụ thể, xin mới
        dsTenTinhThanhVN.add("HÀ NỘI");
        dsTenTinhThanhVN.add("HỒ CHÍ MINH");
        dsTenTinhThanhVN.add("KHÁNH HÒA");
        dsTenTinhThanhVN.add("DAK LAK");
        dsTenTinhThanhVN.add("GIA LAI");
        //B2: tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);
        //b3: gắn vào điều khiển hiện thị listview
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSach);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //lắng nghe và xử lí skien user tương tác
        //gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    //tạo bộ lắng nghe và xu li skien OnItemclick, đặt vào 1 biến
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String strTen = dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this,strTen, Toast.LENGTH_LONG).show();
        }
    };
}