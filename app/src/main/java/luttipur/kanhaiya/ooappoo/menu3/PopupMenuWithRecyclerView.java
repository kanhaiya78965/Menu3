package luttipur.kanhaiya.ooappoo.menu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PopupMenuWithRecyclerView extends AppCompatActivity {
    RecyclerView rev;
    PopupAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu_with_recycler_view);

        rev = findViewById(R.id.rev);
        adapter = new PopupAdapter();
        rev.setAdapter(adapter);

        initPerson();
    }

    private void initPerson() {
        List<String> personList = new ArrayList<>();

        personList.add("Ram");
        personList.add("Raj");
        personList.add("Kanhaiya");
        personList.add("Jay");
        personList.add("Ajay");
        personList.add("Raman");
        personList.add("Laxman");
        personList.add("Karan");
        personList.add("Shyam");
        personList.add("Sohan");
        personList.add("Ramesh");

        adapter.updatePersonList(personList);
    }
}