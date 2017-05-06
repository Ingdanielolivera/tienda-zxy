package com.example.android.tienda_zxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    private Spinner comboOpcionesSexo;
    private String[] opcionesSexo;
    private ArrayAdapter adapterSexo;
    private Spinner comboOpcionesTzapa;
    private String[] opcionesTzapa;
    private ArrayAdapter adapterTzapa;
    private Spinner comboOpcionesMarca;
    private String[] opcionesMarca;
    private ArrayAdapter adapterMarca;
    private TextView cajaPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaPrecio = (TextView) findViewById(R.id.txtresultado);

        comboOpcionesSexo = (Spinner) findViewById(R.id.cmbsexo);
        opcionesSexo =  this.getResources().getStringArray(R.array.opcionesSexo);
        adapterSexo =   new ArrayAdapter(this,android.R.layout.simple_list_item_1,opcionesSexo);
        comboOpcionesSexo.setAdapter(adapterSexo);

        comboOpcionesTzapa = (Spinner) findViewById(R.id.cmbtipozapato);
        opcionesTzapa =  this.getResources().getStringArray(R.array.opcionesTzapa);
        adapterTzapa =   new ArrayAdapter(this,android.R.layout.simple_list_item_1,opcionesTzapa);
        comboOpcionesTzapa.setAdapter(adapterTzapa);

        comboOpcionesTzapa = (Spinner) findViewById(R.id.cmbtipozapato);
        opcionesTzapa =  this.getResources().getStringArray(R.array.opcionesTzapa);
        adapterTzapa =   new ArrayAdapter(this,android.R.layout.simple_list_item_1,opcionesTzapa);
        comboOpcionesTzapa.setAdapter(adapterTzapa);

        comboOpcionesMarca = (Spinner) findViewById(R.id.cmbmarca);
        opcionesMarca =  this.getResources().getStringArray(R.array.opcionesMarca);
        adapterMarca =   new ArrayAdapter(this,android.R.layout.simple_list_item_1,opcionesMarca);
        comboOpcionesMarca.setAdapter(adapterMarca);

    }

    public void Precio(View v){

    }


}
