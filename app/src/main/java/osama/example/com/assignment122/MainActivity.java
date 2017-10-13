package osama.example.com.assignment122;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextName;
    EditText editTextAge;
    EditText editTextPhone;
    EditText editTextCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.name_id);
        editTextAge = (EditText) findViewById(R.id.age_id);
        editTextPhone = (EditText) findViewById(R.id.phone_id);
        editTextCity = (EditText) findViewById(R.id.city_id);

        Button saveButton = (Button) findViewById(R.id.save_btn_id);
        Button showButton = (Button) findViewById(R.id.show_btn_id);

        saveButton.setOnClickListener(this);
        showButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.save_btn_id) ;
        String name = editTextName.getText().toString();
        String age = editTextAge.getText().toString();
        String phone = editTextPhone.getText().toString();
        String city = editTextCity.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("my name", name);
        editor.putString("my age", age);
        editor.putString("my phone", phone);
        editor.putString("my city", city);
        editor.commit();

        Toast.makeText(getApplicationContext(),
                        "Saved   Data"+"\n"+
                        "Name : "+name+"\n"+
                        "Age    : "+age+"\n"+
                        "Phone: "+phone+"\n"+
                        "City    : "+city,
                Toast.LENGTH_LONG).show();


        startActivity(new Intent(getApplicationContext(),SecondActivity.class));
    }
}