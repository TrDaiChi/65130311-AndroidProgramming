package ntu.apptinhtong;

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
    public void BMI(View v){
        EditText editTextWeight =findViewById(R.id.edtA);
        EditText editTextHeight = findViewById(R.id.edtB);
        String strA = editTextWeight.getText().toString();
        String strB = editTextHeight.getText().toString();
        float weight = Float.parseFloat(strA);
        float height = Float.parseFloat(strB)/100;
        EditText editTextKetQua =findViewById(R.id.edtKQ);
        float ketqua = weight / (height * height);
        String strKQ = String.valueOf(ketqua);
        editTextKetQua.setText(strKQ);
    }
}