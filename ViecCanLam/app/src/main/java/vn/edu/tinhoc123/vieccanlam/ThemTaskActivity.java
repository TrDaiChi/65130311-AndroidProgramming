package vn.edu.tinhoc123.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.api.Api;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_task);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextName = findViewById(R.id.edtName);
                EditText editTextMess = findViewById(R.id.edtMess);
                EditText editTextDate = findViewById(R.id.edtDate);
                EditText editTextPrio = findViewById(R.id.edtPrio);

                String name = editTextName.getText().toString();
                String mess = editTextMess.getText().toString();
                String date = editTextDate.getText().toString();
                String prio = editTextPrio.getText().toString();

                TASK task = new TASK(name,date, mess, prio);
                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = firebaseDatabase.getReference("TASK");
                String key = databaseReference.push().getKey();
                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put(key, task.toFireBaseObject());
                databaseReference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if (error == null) {
                            finish();
                        }
                    }
                });
            }
        });
    }
}
