package luttipur.kanhaiya.ooappoo.menu3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class AccountActivity extends AppCompatActivity {

    TextView textView;
    SwitchCompat switchCompat;

    boolean isLoggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        textView = findViewById(R.id.textView);
        switchCompat = findViewById(R.id.switch1);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isLoggedIn = isChecked;
                updateUi();
            }
        });

        updateUi();
    }

    private void updateUi() {
        String text = isLoggedIn ? "Logged In" : "Logged Out";
        textView.setText(text);
        invalidateOptionsMenu();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.acc_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.login) {
            Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show();

        }else if (id == R.id.logout){
            Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();

        }
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
//     menu.removeItem(isLoggedIn ? R.id.login : R.id.logout);
     //or
        if (isLoggedIn)
            menu.removeItem(R.id.login);
        else
            menu.removeItem(R.id.logout);

        return super.onPrepareOptionsMenu(menu);
    }
}