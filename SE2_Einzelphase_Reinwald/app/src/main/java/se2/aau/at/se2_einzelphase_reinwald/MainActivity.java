package se2.aau.at.se2_einzelphase_reinwald;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void check(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextInput);
        TextView feedback = (TextView) findViewById(R.id.feedbackView);
        String message = editText.getText().toString();

        if (checkContent(message)) {
            if (checkLength(message)) {
                if (isPalindrome(message)) {
                    feedback.setText("Es handelt sich um ein Palindrom.");
                } else {
                    feedback.setText("Es handelt sich um kein Palindrom.");
                }
            } else {
                feedback.setText("Der String besitzt weniger als 5 Zeichen.");
            }
        } else {
            feedback.setText("Der String ist leer.");
        }





    }
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static boolean checkLength(String str) {
         if (str.length() < 5) {
             return false;
         }
        return true;
    }
    public static boolean checkContent(String str) {
        if (str.length() == 0) {
            return false;
        }
        return true;
    }

}
