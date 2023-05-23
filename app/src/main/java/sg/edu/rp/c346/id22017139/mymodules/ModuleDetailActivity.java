package sg.edu.rp.c346.id22017139.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView moduleCodeTextView,
            moduleNameTextView,
            academicYearTextView,
            semesterTextView,
            moduleCreditTextView,
            venueTextView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleCodeTextView = findViewById(R.id.moduleCodeTextView);
        moduleNameTextView = findViewById(R.id.moduleNameTextView);
        academicYearTextView = findViewById(R.id.academicYearTextView);
        semesterTextView = findViewById(R.id.semesterTextView);
        moduleCreditTextView = findViewById(R.id.moduleCreditTextView);
        venueTextView = findViewById(R.id.venueTextView);
        backButton = findViewById(R.id.backButton);

        Intent intent = getIntent();
        if (intent != null) {
            String moduleCode = intent.getStringExtra("moduleCode");
            String moduleName = intent.getStringExtra("moduleName");
            String academicYear = intent.getStringExtra("academicYear");
            String semester = intent.getStringExtra("semester");
            String moduleCredit = intent.getStringExtra("moduleCredit");
            String venue = intent.getStringExtra("venue");

            moduleCodeTextView.setText(getString(R.string.module_code, moduleCode));
            moduleNameTextView.setText(getString(R.string.module_name, moduleName));
            academicYearTextView.setText(getString(R.string.academic_year, academicYear));
            semesterTextView.setText(getString(R.string.semester, semester));
            moduleCreditTextView.setText(getString(R.string.module_credit, moduleCredit));
            venueTextView.setText(getString(R.string.venue, venue));
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
