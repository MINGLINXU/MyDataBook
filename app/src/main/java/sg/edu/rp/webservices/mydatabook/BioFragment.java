package sg.edu.rp.webservices.mydatabook;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BioFragment extends Fragment {

    Button btnEdit;
    TextView tvContent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bio, container, false);
        btnEdit = v.findViewById(R.id.btnEdit);
        tvContent = v.findViewById(R.id.tvContent);

        SharedPreferences pref = getActivity().getPreferences(Context.MODE_PRIVATE);
        final SharedPreferences.Editor edt = pref.edit();
        String saved = pref.getString("saved_bio", "Please click the Edit button");
        tvContent.setText(saved);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(getContext()).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("Alert message to be shown");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                tvContent.setText("Response is OK");
                                edt.putString("saved_bio", tvContent.getText().toString());
                                edt.commit();
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "CANCEL",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                tvContent.setText("Response is Cancel");
                                edt.putString("saved_bio", tvContent.getText().toString());
                                edt.commit();
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        return v;
    }
}