package com.example.app3mobilebyandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.*;




public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		setContentView(R.layout.main);
		
		//TextView monTexte = (TextView)findViewById(R.id.monText);
		//monTexte.setText("Bonjour tout le monde !**********");

		// Nous cherchons le bouton dans notre interface
		  Button button = (Button) findViewById(R.id.monBouton);
		  
		// Nous paramétrons un écouteur sur l’événement ‘click’ de ce bouton
         button.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
               
            	// On récupère notre EditText
            	 EditText texte = ((EditText)findViewById(R.id.monEditText));
            	 // On garde la chaîne de caractères
            	 String nom = texte.getText().toString();

            	// Nous affichons un message à l’utilisateur
            Toast.makeText(MainActivity.this, nom, Toast.LENGTH_LONG).show();

             }
         
         });
         
         


         
         
         

	}

	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
