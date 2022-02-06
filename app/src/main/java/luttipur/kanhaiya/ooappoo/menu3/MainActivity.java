package luttipur.kanhaiya.ooappoo.menu3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.item1){
           // Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,AccountActivity.class));
        }else if (id==R.id.item2){
           // Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,PopupMenuWithRecyclerView.class));
        }else if (id==R.id.item3){
            Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.subItem1){
            Toast.makeText(this, "sub item 1", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.subItem2){
            Toast.makeText(this, "sub item 2", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.subItem3){
            Toast.makeText(this, "sub item 3", Toast.LENGTH_SHORT).show();
        }
        else if (id==R.id.blue){
            Toast.makeText(this, "bluetooth", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}