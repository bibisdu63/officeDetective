package iut.lp.pm.officedetective;

import iut.lp.pm.officedetective.R;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager fragmentManager = getFragmentManager();
		if (fragmentManager.findFragmentById(R.id.fragment)==null){

			FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); 

			CrimeFragment fragement = new CrimeFragment();
			fragmentTransaction.add(R.id.fragment, fragement);
			fragmentTransaction.commit();

		}
	}
}
