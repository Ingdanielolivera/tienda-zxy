package com.example.android.tienda_zxy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
    private EditText cajaCantidad;
    private TextView cajaUnitario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaPrecio = (TextView) findViewById(R.id.txtresultado);
        cajaCantidad = (EditText) findViewById(R.id.txtcantidad);
        cajaUnitario = (TextView) findViewById(R.id.txtunit);

        comboOpcionesSexo = (Spinner) findViewById(R.id.cmbsexo);
        opcionesSexo = this.getResources().getStringArray(R.array.opcionesSexo);
        adapterSexo = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opcionesSexo);
        comboOpcionesSexo.setAdapter(adapterSexo);

        comboOpcionesTzapa = (Spinner) findViewById(R.id.cmbtipozapato);
        opcionesTzapa = this.getResources().getStringArray(R.array.opcionesTzapa);
        adapterTzapa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opcionesTzapa);
        comboOpcionesTzapa.setAdapter(adapterTzapa);

        comboOpcionesTzapa = (Spinner) findViewById(R.id.cmbtipozapato);
        opcionesTzapa = this.getResources().getStringArray(R.array.opcionesTzapa);
        adapterTzapa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opcionesTzapa);
        comboOpcionesTzapa.setAdapter(adapterTzapa);

        comboOpcionesMarca = (Spinner) findViewById(R.id.cmbmarca);
        opcionesMarca = this.getResources().getStringArray(R.array.opcionesMarca);
        adapterMarca = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opcionesMarca);
        comboOpcionesMarca.setAdapter(adapterMarca);

    }


    public void Precio(View v) {
        int opsexo, optzapa, opmarca, cant, res = 0;

        if (validar()) {
            opsexo = comboOpcionesSexo.getSelectedItemPosition();
            optzapa = comboOpcionesTzapa.getSelectedItemPosition();
            opmarca = comboOpcionesMarca.getSelectedItemPosition();
            cant = Integer.parseInt(cajaCantidad.getText().toString());

            switch (opsexo) {

                case 0:
                    switch (optzapa) {
                        case 0:
                            switch (opmarca) {
                                case 0:
                                    res = cant * 120000;
                                    cajaUnitario.setText("$120.000");
                                    break;
                                case 1:
                                    res = cant * 140000;
                                    cajaUnitario.setText("$140.000");
                                    break;
                                case 2:
                                    res = cant * 130000;
                                    cajaUnitario.setText("$130.000");
                                    break;
                            }
                            break;
                        case 1:
                            switch (opmarca) {
                                case 0:
                                    res = cant * 50000;
                                    cajaUnitario.setText("$50.000");
                                    break;
                                case 1:
                                    res = cant * 80000;
                                    cajaUnitario.setText("$80.000");
                                    break;
                                case 2:
                                    res = cant * 100000;
                                    cajaUnitario.setText("$100.000");
                                    break;
                            }
                    }
                    break;
                case 1:
                    switch (optzapa) {
                        case 0:
                            switch (opmarca) {
                                case 0:
                                    res = cant * 100000;
                                    cajaUnitario.setText("$100.000");
                                    break;
                                case 1:
                                    res = cant * 130000;
                                    cajaUnitario.setText("$130.000");
                                    break;
                                case 2:
                                    res = cant * 110000;
                                    cajaUnitario.setText("$110.000");
                                    break;
                            }
                            break;
                        case 1:
                            switch (opmarca) {
                                case 0:
                                    res = cant * 60000;
                                    cajaUnitario.setText("$60.000");
                                    break;
                                case 1:
                                    res = cant * 70000;
                                    cajaUnitario.setText("$70.000");
                                    break;
                                case 2:
                                    res = cant * 120000;
                                    cajaUnitario.setText("$120.000");
                                    break;
                            }
                    }
                    break;
            }
            cajaPrecio.setText("$" + res);

            View view = this.getCurrentFocus();
            view.clearFocus();
            if (view != null) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public boolean validar() {
        if (cajaCantidad.getText().toString().isEmpty()) {
            cajaCantidad.setError(this.getResources().getString(R.string.error_cantidad));
            cajaCantidad.requestFocus();
            return false;
        }
        if (Integer.parseInt(cajaCantidad.getText().toString()) == 0) {
            cajaCantidad.setError(this.getResources().getString(R.string.error_cantidad_zero));
            cajaCantidad.requestFocus();
            return false;
        }
        return true;
    }

    public void borrar (View v){
        cajaCantidad.setText("");
        cajaUnitario.setText("");
        cajaPrecio.setText("");
        View view = this.getCurrentFocus();
        view.clearFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}