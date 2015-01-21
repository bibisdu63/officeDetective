package iut.lp.pm.officedetective;

import java.util.ArrayList;
import java.util.Date;

public class CrimeLab {
	
	static private CrimeLab c = null;
	static public CrimeLab getInstance(){
		if(c==null)
			c=new CrimeLab();
		return c;
	}
	
	private ArrayList<Crime> listeDeCrimes = new ArrayList<Crime>();
	/**
	 * @return the listeDeCrimes
	 */
	public ArrayList<Crime> getListeDeCrimes() {
		return listeDeCrimes;
	}

	/**
	 * @param listeDeCrimes the listeDeCrimes to set
	 */
	public void setListeDeCrimes(ArrayList<Crime> listeDeCrimes) {
		this.listeDeCrimes = listeDeCrimes;
	}
	
	public void initListe(){
		for (int i = 0 ; i< 100 ; i ++)
			c.listeDeCrimes.add(new Crime("crime "+ i,new Date(),false));
	}
	
}
