package com.example.listado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    ListView lvProductos, lvPrecios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProductos=findViewById(R.id.lvProducto);
        lvPrecios=findViewById(R.id.lvPrecio);

        ArrayAdapter<String> adaptadorProducto= new ArrayAdapter<String>(this,R.layout.listita_productos,R.id.idProducto,getResources().getStringArray(R.array.arraysitoProducto));
        ArrayAdapter<String> adapterPrecio= new ArrayAdapter<String>(this,R.layout.listita_precios,R.id.idPrecio,getResources().getStringArray(R.array.arraysitoPrecio));

        lvProductos.setAdapter(adaptadorProducto);
        lvPrecios.setAdapter(adapterPrecio);

    }





}