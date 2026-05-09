package vn.edu.tinhoc123.vieccanlam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class MainActivity extends AppCompatActivity {
    List<TASK> lstVCL;
    TaskRCVAdapter adapter;
    FloatingActionButton btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.floatingActionButton);

        // 2. Viết sự kiện click để chuyển màn hình
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình ThemTaskActivity (hoặc tên Activity thêm task của bạn)
                Intent intent = new Intent(MainActivity.this, ThemTaskActivity.class);
                startActivity(intent);
            }
        });
        //tạo kết nối đến csdl
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("TASK");
    //LẮNG NGHE VÀ XỬ LÝ
        lstVCL = new ArrayList<TASK>();

        databaseReference.addValueEventListener(ngheFB);

        RecyclerView recyclerView = findViewById(R.id.recycleViewVCL);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        adapter = new TaskRCVAdapter(lstVCL);
        recyclerView.setAdapter(adapter);

    }
    ValueEventListener ngheFB = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                lstVCL.clear();
                //lấy dữ liệu từ snapshot, đưa vào 1 biến danh sách để xử lý
                for(DataSnapshot obj: snapshot.getChildren()) {
                    TASK task = obj.getValue(TASK.class);
                    lstVCL.add(task);
                    //Log.w("VCL app", "Việc cần làm: " + task.getName());
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };
}