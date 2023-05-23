package sg.edu.rp.c346.id22017139.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Event handling Step 1
    Button  btnC110, btnC203, btnC206, btnC218, btnC346 ,btnG956;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Event handling Step 2
        btnC110 = findViewById(R.id.C110);
        btnC203 = findViewById(R.id.C203);
        btnC206 = findViewById(R.id.C206);
        btnC218 = findViewById(R.id.C218);
        btnC346 = findViewById(R.id.C346);
        btnG956 = findViewById(R.id.G953);
        //Event handling Step 3
        btnC110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchModuleDetailActivity(getString(R.string.C110_code),
                        getString(R.string.C110_name),
                        getString(R.string.C110_academic_year),
                        getString(R.string.C110_semester),
                        getString(R.string.C110_credit),
                        getString(R.string.C110_venue));
            }
        });

        btnC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchModuleDetailActivity(getString(R.string.C203_code),
                        getString(R.string.C203_name),
                        getString(R.string.C203_academic_year),
                        getString(R.string.C203_semester),
                        getString(R.string.C203_credit),
                        getString(R.string.C203_venue));
            }
        });

        btnC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchModuleDetailActivity(getString(R.string.C206_code),
                        getString(R.string.C206_name),
                        getString(R.string.C206_academic_year),
                        getString(R.string.C206_semester),
                        getString(R.string.C206_credit),
                        getString(R.string.C206_venue));
            }
        });

        btnC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchModuleDetailActivity(getString(R.string.C218_code),
                        getString(R.string.C218_name),
                        getString(R.string.C218_academic_year),
                        getString(R.string.C218_semester),
                        getString(R.string.C218_credit),
                        getString(R.string.C218_venue));
            }
        });
        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchModuleDetailActivity(getString(R.string.C346_code),
                        getString(R.string.C346_name),
                        getString(R.string.C346_academic_year),
                        getString(R.string.C346_semester),
                        getString(R.string.C346_credit),
                        getString(R.string.C346_venue));
            }
        });
        btnG956.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchModuleDetailActivity(getString(R.string.G953_code),
                        getString(R.string.G953_name),
                        getString(R.string.G953_academic_year),
                        getString(R.string.G953_semester),
                        getString(R.string.G953_credit),
                        getString(R.string.G953_venue));
            }
        });
    }

    private void launchModuleDetailActivity(String moduleCode, String moduleName, String academicYear,
                                            String semester, String moduleCredit, String venue) {
        Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
        intent.putExtra("moduleCode", moduleCode);
        intent.putExtra("moduleName", moduleName);
        intent.putExtra("academicYear", academicYear);
        intent.putExtra("semester", semester);
        intent.putExtra("moduleCredit", moduleCredit);
        intent.putExtra("venue", venue);
        startActivity(intent);

    }
}