package com.example.mymaps;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng lokasi_saya = new LatLng(-7.714063, 113.066688);
        mMap.addMarker(new MarkerOptions().position(lokasi_saya).title("Lokasi Saya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lokasi_saya));

        LatLng spbu = new LatLng(-7.718063, 113.070438);
        mMap.addMarker(new MarkerOptions().position(spbu).title("SPBU Pertamina 54.671.30"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu));

        LatLng restoran = new LatLng(-7.717313, 113.067187);
        mMap.addMarker(new MarkerOptions().position(restoran).title("Rumah Makan Rawon Madura Nguling"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(restoran));

        LatLng kantor_polisi = new LatLng(-7.714438, 113.079063);
        mMap.addMarker(new MarkerOptions().position(kantor_polisi).title("Polsek Nguling"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kantor_polisi));

        LatLng tempat_wisata = new LatLng(-7.720687, 113.012063);
        mMap.addMarker(new MarkerOptions().position(tempat_wisata).title("Obyek Wisata Ranu Grati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tempat_wisata));

        LatLng sekolah_SD = new LatLng(-7.718812, 113.059687);
        mMap.addMarker(new MarkerOptions().position(sekolah_SD).title("SDN Sedarum 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah_SD));

        LatLng kantor_bupati = new LatLng(-7.648313, 112.905562);
        mMap.addMarker(new MarkerOptions().position(kantor_bupati).title("Kantor Bupati Pasuruan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kantor_bupati));

        Polyline garis = mMap.addPolyline(new PolylineOptions().add(lokasi_saya,spbu).width(5).color(Color.RED));
    }
}
