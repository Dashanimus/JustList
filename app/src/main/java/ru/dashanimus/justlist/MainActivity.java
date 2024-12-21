package ru.dashanimus.justlist;

import android.os.Bundle;
import android.widget.TextView;
import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    
    private TextView ElList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ElList=findViewById(R.id.tv_el_names);
        String[]names={"Первый элемент списка","Второй элемент списка","Третий элемент списка",
                "Четвёртый элемент списка", "Пятый элемент списка", "Шестой элемент списка",
                "Седьмой элемент списка"};
        ElList.setText("");

        for (String name:names) {
            ElList.append(name+"\n");
        }

    }
}