package luttipur.kanhaiya.ooappoo.menu3;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PopupAdapter extends RecyclerView.Adapter<PopupAdapter.PopupViewHolder> {

    List<String> personList = new ArrayList<>();
    public void updatePersonList(List<String> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public PopupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.sample_popup_menu,parent,false);

        return new PopupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopupViewHolder holder, int position) {
       holder.bindView(personList.get(position));
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    class PopupViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
        TextView txt;
        ImageButton imgBtn;
        public PopupViewHolder(@NonNull View itemView) {
            super(itemView);

            txt = itemView.findViewById(R.id.textView2);
            imgBtn = itemView.findViewById(R.id.imageButton);

            imgBtn.setOnClickListener(this);
        }

        void bindView(String person) {
            txt.setText(person);

        }

        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }

        private void showPopupMenu(View view) {
            PopupMenu popupMenu = new PopupMenu(view.getContext(),view);
            popupMenu.inflate(R.menu.rev_popup);
            popupMenu.setOnMenuItemClickListener(this);

            popupMenu.show();
        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            int id = item.getItemId();
            if (id == R.id.edit){
                Toast.makeText(imgBtn.getContext(), "Edit @position : "+(getAdapterPosition()+1), Toast.LENGTH_SHORT).show();
            }else if (id == R.id.delete)
                Toast.makeText(imgBtn.getContext(), "Delete @position : "+(getAdapterPosition()+1), Toast.LENGTH_SHORT).show();

            return true;
        }
    }
}
