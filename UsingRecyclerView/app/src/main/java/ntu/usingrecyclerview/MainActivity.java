package ntu.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recycleViewDatas;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recycleViewDatas = getDataForRecycleView();
        recyclerViewLandScape = findViewById(R.id.recycleLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, recycleViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecycleView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        dsDuLieu.add( new LandScape("eiffel", "Tháp eiffel"));
        dsDuLieu.add( new LandScape("hoguom", "Hồ Gươm"));
        dsDuLieu.add( new LandScape("langbac", "Lăng Chủ Tịch HCM"));
        return dsDuLieu;
    }
}