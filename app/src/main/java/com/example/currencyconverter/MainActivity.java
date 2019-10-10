package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick( View v )
    {
        EditText t = findViewById( R.id.dollarAmount );
        double dollar = Double.parseDouble( t.getText().toString() );
        double toYen = dollar * 106.82;
        DecimalFormat df = new DecimalFormat( "0.00" );
        Toast.makeText( this, "$" + dollar + " in Yen is " + df.format( toYen ), Toast.LENGTH_SHORT ).show();
    }
}
