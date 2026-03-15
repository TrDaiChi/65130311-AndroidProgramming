package till.edu.appcong_65130311;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //bộ lắng nghe và xử lý
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //lấy dữ liệu ve` ở điều khiển số A
        String strA = editTextSoA.getText().toString();
        //lấy dữ liệu ve` ở điều khiển số B
        String strB = editTextSoB.getText().toString();
        //chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        //tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong); //chuyển sang dạng chuỗi
        //hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}

