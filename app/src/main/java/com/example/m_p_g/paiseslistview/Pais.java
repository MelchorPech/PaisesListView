package com.example.m_p_g.paiseslistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Pais extends BaseAdapter{

    private Integer[] BanderasImg = {
            R.drawable.alemania,
            R.drawable.argentina,
            R.drawable.brasil,
            R.drawable.china,
            R.drawable.espana,
            R.drawable.francia,
            R.drawable.inglaterra,
            R.drawable.japon,
            R.drawable.mexico,
            R.drawable.portugal};

    private String [] imagenesNombre;
    private String [] imagenesDominio;
    private Context context;
    private LayoutInflater thisInflater;

    public Pais(Context con, String[] imgNombre, String[] imgDominio) {
        this.context = con;
        this.thisInflater = LayoutInflater.from(con);
        this.imagenesNombre = imgNombre;
        this.imagenesDominio = imgDominio;
    }

    @Override
    public int getCount() {

        return BanderasImg.length;
    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null){
            convertView = thisInflater.inflate(R.layout.lista_paises, parent, false);

            TextView lblNombre = (TextView)convertView.findViewById(R.id.lblNombre);
            TextView lblDominio = (TextView)convertView.findViewById(R.id.lblDominio);
            ImageView imgBand = (ImageView) convertView.findViewById(R.id.imgBandera);

            lblNombre.setText(imagenesNombre[position]);
            lblDominio.setText(imagenesDominio[position]);
            imgBand.setImageResource(BanderasImg[position]);
        }
        return convertView;
    }
}