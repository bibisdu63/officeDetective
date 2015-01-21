package com.example.officedetective;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class CrimeListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crime_list);

		FragmentManager fragmentManager = getFragmentManager();
		if (fragmentManager.findFragmentById(R.id.fragmentList)==null){

			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); 
			
			CrimeListFragment fragement = new CrimeListFragment();
			fragmentTransaction.add(R.id.fragmentList, fragement);
			fragmentTransaction.commit();
		}
	}
}
