package sg.edu.rp.webservices.mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;




public class CustomAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ImageView ivRow;
    TextView tvTitle;
    private String[] drawerItems;

    public CustomAdapter( Context context, int resource, String[] drawerItems) {
        super(context, resource, drawerItems);
        this.context = context;
        this.resource = resource;
        this.drawerItems = drawerItems;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, null, false);
        ivRow = (ImageView) rowView.findViewById(R.id.ivRow);
        tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);



        String title  = drawerItems[position];

        switch (title){
            case "Bio": tvTitle.setText(title);
                        ivRow.setImageResource(android.R.drawable.ic_dialog_info);
            case "Vaccination": tvTitle.setText(title);
                ivRow.setImageResource(android.R.drawable.ic_menu_edit);
            case "Anniversary": tvTitle.setText(title);
                ivRow.setImageResource(android.R.drawable.ic_menu_today);
            case "About Us": tvTitle.setText(title);
                ivRow.setImageResource(android.R.drawable.star_big_on);

        }
        return rowView;
    }
}
