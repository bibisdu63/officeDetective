package com.example.officedetective;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class CrimeListFragment extends ListFragment {
	 @Override
     public void onActivityCreated(Bundle savedInstanceState) {
         super.onActivityCreated(savedInstanceState);
         
         setListAdapter(new CrimeAdapter(getActivity(),android.R.layout.simple_list_item_1, CrimeLab.getInstance().getListeDeCrimes()));
     }

     @Override 
     public void onListItemClick(ListView l, View v, int position, long id) {
         Log.i("test", "Item clicked: " + id);
         Intent i = new Intent(getActivity(),CrimeActivity.class);
         i.putExtra("id",id);
         
         i.putExtra("titre",CrimeLab.getInstance().getListeDeCrimes().get(position).getTitre());
         i.putExtra("date",CrimeLab.getInstance().getListeDeCrimes().get(position).getDateCrime().toString());
         i.putExtra("resolu",CrimeLab.getInstance().getListeDeCrimes().get(position).getResolu());
         
       
         startActivity(i);
     }
}
