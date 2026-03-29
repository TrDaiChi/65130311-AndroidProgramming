package ntu.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //tìm list view
        ListView lvDSMonAn = findViewById(R.id.lvDSMonAn);
        //chuẩn bị dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm tấm sườn",25000,"Mỗi sườn",R.drawable.contams));
        dsMonAn.add(new MonAn("Cơm tấm sườn trứng",30000,"sườn và trứng",R.drawable.comtamst));
        dsMonAn.add(new MonAn("Cơm tấm sà bì chưởng ",35000,"sườn bì chả",R.drawable.comtamsbc));
        dsMonAn.add(new MonAn("Cơm tấm gà",30000,"Mỗi gà",R.drawable.comtamg));
        dsMonAn.add(new MonAn("Cơm gà xối mỡ",30000,"gà xối mỡ",R.drawable.comgaxm));

        MonAnAdapter adapter = new MonAnAdapter(dsMonAn,this);
        lvDSMonAn.setAdapter(adapter);
        //bắt xử lí skien
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //lấy phần tử được chọn
                MonAn monAnChon = dsMonAn.get(position);
                Toast.makeText(MainActivity.this,monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}