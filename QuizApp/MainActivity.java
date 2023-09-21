import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView, resultTextView;
    private RadioGroup choicesRadioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton, choice3RadioButton;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionTextView);
        resultTextView = findViewById(R.id.resultTextView);
        choicesRadioGroup = findViewById(R.id.choicesRadioGroup);
        choice1RadioButton = findViewById(R.id.choice1RadioButton);
        choice2RadioButton = findViewById(R.id.choice2RadioButton);
        choice3RadioButton = findViewById(R.id.choice3RadioButton);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });
    }

    private void checkAnswer() {
        // Implement answer checking logic based on user selection and show result
        // For simplicity, let's assume the correct answer is choice1 (Paris)
        if (choice1RadioButton.isChecked()) {
            resultTextView.setText("Correct! Paris is the capital of France.");
        } else {
            resultTextView.setText("Incorrect. The correct answer is Paris.");
        }
    }
}
