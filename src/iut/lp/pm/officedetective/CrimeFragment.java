package iut.lp.pm.officedetective;

import iut.lp.pm.officedetective.R;

import java.util.Date;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
public class CrimeFragment extends Fragment {

	/* (non-Javadoc)
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	Crime crime = new Crime("test Crime",new Date(),true);
	static final String ISCREER = "iscreer";
	static final String TEXTE = "texte";
	boolean creer = false;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_crime,container,false);
		EditText editText = (EditText) view.findViewById(R.id.titre);
		
		editText.setText(crime.getTitre());

		
		editText.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				crime.setTitre(s.toString());
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				
			}
		});
		Button b = (Button) view.findViewById(R.id.button1);
		b.setText(crime.getDateCrime().toString());
		
		final CheckBox cb = (CheckBox)view.findViewById(R.id.checkBox1);
		cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				crime.setResolu(cb.isChecked());
				
			}
		});
		cb.setChecked(crime.getResolu());
		
		return view;
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		outState.putBoolean(ISCREER, creer);
		super.onSaveInstanceState(outState);
	}

	
}
