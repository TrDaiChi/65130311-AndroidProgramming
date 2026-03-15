package ntu.linelayout_tong2so;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai báo các đối tượng gắn với điều khiển
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }
    //xử lý cộng
    public void XuLyCong(View v){
        //b1: lấy dữ liệu 2 số
        //1.1: tìm editText

        //b1.2: lấy dữ liệu từ 2 điều khiển
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        //tính toán
        float tong = soA + soB;
        //hiện kq

        //CHUẨN BỊ DỮ LIỆU XUẤT
        String chuoiKQ = String.valueOf(tong);
        //gắn kết quả lên điều kiện
        editTextKQ.setText(chuoiKQ);
    }
    //xử lý trừ
    public void XuLyTru(View v){
        //b1: lấy dữ liệu 2 số
        //1.1: tìm editText
        //b1.2: lấy dữ liệu từ 2 điều khiển
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        //tính toán
        float hieu = soA - soB;
        //hiện kq
        //CHUẨN BỊ DỮ LIỆU XUẤT
        String chuoiKQ = String.valueOf(hieu);
        //gắn kết quả lên điều kiện
        editTextKQ.setText(chuoiKQ);
    }
    //xử lý nhân
    public void XuLyNhan(View v){
        //b1: lấy dữ liệu 2 số
        //1.1: tìm editText

        //b1.2: lấy dữ liệu từ 2 điều khiển
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        //tính toán
        float tich = soA * soB;
        //hiện kq
        //CHUẨN BỊ DỮ LIỆU XUẤT
        String chuoiKQ = String.valueOf(tich);
        //gắn kết quả lên điều kiện
        editTextKQ.setText(chuoiKQ);
    }
    //xử lý chia
    public void XuLyChia(View v){
        //b1: lấy dữ liệu 2 số
        //1.1: tìm editText
        //b1.2: lấy dữ liệu từ 2 điều khiển
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //chuyển từ chuỗi sang số
        float soA = Float.parseFloat(so1);
        float soB = Float.parseFloat(so2);
        //tính toán
        float thuong = soA / soB;
        //hiện kq
        //CHUẨN BỊ DỮ LIỆU XUẤT
        String chuoiKQ = String.valueOf(thuong);
        //gắn kết quả lên điều kiện
        editTextKQ.setText(chuoiKQ);
    }
}