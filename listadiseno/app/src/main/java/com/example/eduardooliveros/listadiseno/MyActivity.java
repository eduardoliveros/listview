package com.example.eduardooliveros.listadiseno;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MyActivity extends Activity {

    TipoDatos[] datos=new TipoDatos[]{
            new TipoDatos("uno","dos"),
            new TipoDatos("tres","cuatro"),
            new TipoDatos("tres1","cuatro1"),
            new TipoDatos("seis","cinco")};
    String[] datos1= new String[]{"uno","dos","tres"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ListView Lista =(ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos1);

        AdapterTitles adapter = new AdapterTitles(this);
        Lista.setAdapter(adapter);


    }

    class AdapterTitles extends ArrayAdapter<TipoDatos>{
        Activity context;

        public AdapterTitles(Activity context){
            super(context, R.layout.titulo_listas,datos);
            this.context=context;
        }

        public View getView(int position, View view, ViewGroup parent){

            LayoutInflater inflater= context.getLayoutInflater();
            View item=inflater.inflate(R.layout.titulo_listas,null);

            TextView Amount=(TextView) item.findViewById(R.id.titulo);
            Amount.setText(datos[position].getTitulo());

            TextView Date=(TextView) item.findViewById(R.id.subtitulo);
            Date.setText(datos[position].getSubtitulo());


            return null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
}
