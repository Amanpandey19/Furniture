package com.aman.furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<Arrival> arrivals;
    ArrivalsAdapter arrivalsAdapter;
    RecyclerView arrivalsRv;


    ArrayList<Recent> recent;
    RecentAdapter recentAdapter;
    RecyclerView recentRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setArrivals();
        setRecent();
    }

    private void setRecent() {
        recentRv = findViewById(R.id.recentRv);
        recent = new ArrayList<>();
        recent.add(new Recent("Leatherette Lamp", "$15.18", this.getDrawable(R.drawable.img_6)));
        recent.add(new Recent("Trade Carft Apple Chair ", "$9.12", this.getDrawable(R.drawable.recliner)));
        recent.add(new Recent("Leatherette Sofa", "$15.18", this.getDrawable(R.drawable.img_4)));


        recentAdapter = new RecentAdapter(HomeActivity.this, recent);
        recentRv.setLayoutManager(new LinearLayoutManager(HomeActivity.this, RecyclerView.VERTICAL, false));
        recentRv.setAdapter(recentAdapter);
    }

    private void setArrivals() {
        arrivalsRv = findViewById(R.id.arrivals_rv);
        arrivals = new ArrayList<>();
        arrivals.add(new Arrival("Leatherette Sofa", "$15.18", this.getDrawable(R.drawable.img_4), false));
        arrivals.add(new Arrival("Trade Carft Apple Chair ", "$9.12", this.getDrawable(R.drawable.recliner), false));
        arrivals.add(new Arrival("Waltz Wood King Box Bed", "$24.43", this.getDrawable(R.drawable.bed), false));
        arrivals.add(new Arrival("WAKESURE 3 Seater Sofa", "$21.56", this.getDrawable(R.drawable.sofa), false));
        arrivals.add(new Arrival("Leatherette Sofa", "$15.18", this.getDrawable(R.drawable.img_4), false));
        arrivals.add(new Arrival("Waltz Wood King Box Bed", "$24.43", this.getDrawable(R.drawable.bed), false));
        arrivals.add(new Arrival("WAKESURE 3 Seater Sofa", "$21.56", this.getDrawable(R.drawable.sofa), false));
        arrivals.add(new Arrival("Trade Carft Apple Chair ", "$9.12", this.getDrawable(R.drawable.recliner), false));


        arrivalsAdapter = new ArrivalsAdapter(HomeActivity.this, arrivals);
        arrivalsRv.setLayoutManager(new LinearLayoutManager(HomeActivity.this, RecyclerView.HORIZONTAL, false));
        arrivalsRv.setAdapter(arrivalsAdapter);

    }
}