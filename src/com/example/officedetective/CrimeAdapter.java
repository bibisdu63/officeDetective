package com.example.officedetective;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class CrimeAdapter extends ArrayAdapter<Crime> {

	public CrimeAdapter(Context context, int resource, ArrayList<Crime> arrayList) {
		super(context, resource, arrayList);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.widget.ArrayAdapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if(v==null)
		{
			LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v=inflater.inflate(R.layout.list_item_crime,parent,false);
		}
		TextView name = (TextView) v.findViewById(R.id.textView1);
		TextView date = (TextView) v.findViewById(R.id.textView2);
		CheckBox c = (CheckBox)v.findViewById(R.id.checkBox1);
		Crime cr = CrimeLab.getInstance().getListeDeCrimes().get(position);
		name.setText(cr.getTitre());
		date.setText(cr.getDateCrime().toString());
		c.setChecked(cr.getResolu());
		
		
		return v;
	}
	

}
