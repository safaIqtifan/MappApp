package com.example.mapapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

        LatLng gaza = new LatLng(31.2960397,34.5549365);
        LatLng gaza1 = new LatLng(31.2960397,34.5549365);
        LatLng gaza2 = new LatLng(31.2960397,34.5549365);


mMap.addMarker(new MarkerOptions().position(gaza).title("Marker in Gaza"));
mMap.addMarker(new MarkerOptions().position(gaza1).title("Marker in Gaza"));
mMap.addMarker(new MarkerOptions().position(gaza2).title("Marker in Gaza"));

//mMap.moveCamera(CameraUpdateFactory.newLatLng(gaza));
//mMap.moveCamera(CameraUpdateFactory.newLatLng(gaza, 12));
mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(gaza, 12));
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}