package osama.example.com.assignment122;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SharedPreferences sharedPreferences=getSharedPreferences("pref",MODE_PRIVATE);
        String name=sharedPreferences.getString("my name","no name found");
        TextView textView=(TextView)findViewById(R.id.name_id);
        textView.setText(name);

        String age=sharedPreferences.getString("my age","no age found");
        textView = (TextView) findViewById(R.id.age_id);
        textView.setText(age);

        String phone=sharedPreferences.getString("my phone","no phone found");
        textView = (TextView) findViewById(R.id.phone_id);
        textView.setText(phone);

        String city=sharedPreferences.getString("my city","no city found");
        textView = (TextView) findViewById(R.id.city_id);
        textView.setText(city);
    }

}
