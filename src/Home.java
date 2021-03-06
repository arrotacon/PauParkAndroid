package fr.univpau.pauparkdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;

public class Home extends Activity {

	private Spinner spinner_home;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		//addItemsOnSpinnerHome(); //Fait par XML
		//addListenerOnButton(); // Fait par XML
		addListenerOnSpinnerItemSelection();

	}

	/*
	 * public void addItemsOnSpinnerHome() { // Methode non XML pour ajouter des
	 * Strings au spinner (la vue) grace a un adapter
	 * 
	 * spinner_home = (Spinner) findViewById(R.id.spinner1); // recuperation du
	 * spinner List<String> list = new ArrayList<String>(); // creation d une
	 * list de Strings list.add("Parking"); // ajout d'elements String a la list
	 * list.add("Good Deal"); // ArrayAdapter<String> dataAdapter = new
	 * ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
	 * // creation d un adapter pour les Strings
	 * dataAdapter.setDropDownViewResource
	 * (android.R.layout.simple_spinner_dropdown_item); // on lui applique un
	 * layout de base spinner_home.setAdapter(dataAdapter); //
	 * "adaptation"/"correspondance" des Strings a la vue Spinner }
	 */

	public void addListenerOnSpinnerItemSelection() {
		spinner_home = (Spinner) findViewById(R.id.spinner1);
		spinner_home.setOnItemSelectedListener(new OnHomeItemSelectedListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void OnClickHomeButton() {
		
		Intent intent = new Intent();
		
		intent.setClass(Home.this, Parking.class);
		
		if (String.valueOf(spinner_home.getSelectedItem()) == "Parking") {
			
			intent.setClass(Home.this, Parking.class);

		} else {
			
			intent.setClass(Home.this, GoodDeal.class);

		}
	}
	
	/*public void addListenerOnButton() { // Methode non XML pour ecouter un evenement button
		 
		spinner_home = (Spinner) findViewById(R.id.spinner1);
		button_home = (Button) findViewById(R.id.button1);
	 
		button_home.setOnClickListener(new OnClickListener() {
	 
		  @Override
		  public void onClick(View v) {
		  
		  
		  
		  }
	 
		});*/
	
}
