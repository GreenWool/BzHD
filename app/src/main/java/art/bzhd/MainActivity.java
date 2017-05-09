package art.bzhd;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import art.bzhd.FragmentLectures.FragmentGO;
import art.bzhd.FragmentLectures.FragmentLbez;
import art.bzhd.FragmentLectures.FragmentMed;
import art.bzhd.FragmentLectures.FragmentOMP;
import art.bzhd.FragmentLectures.FragmentPriroda;
import art.bzhd.FragmentLectures.FragmentRSCS;
import art.bzhd.FragmentLectures.FragmentSocium;
import art.bzhd.FragmentLectures.FragmentTexnogen;
import art.bzhd.FragmentLectures.FragmentZOG;
import art.bzhd.FragmentTests.FragmentTest1;
import art.bzhd.FragmentTests.FragmentTest2;
import art.bzhd.FragmentTests.FragmentTest3;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    FragmentGO fragmentGO;
    FragmentLbez fragmentLbez;
    FragmentMed fragmentMed;
    FragmentOMP fragmentOMP;
    FragmentPriroda fragmentPriroda;
    FragmentRSCS fragmentRSCS;
    FragmentSocium fragmentSocium;
    FragmentTexnogen fragmentTexnogen;
    FragmentZOG fragmentZOG;
    FragmentTest1 fragmentTest1;
    FragmentTest2 fragmentTest2;
    FragmentTest3 fragmentTest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentGO = new FragmentGO();
        fragmentLbez = new FragmentLbez();
        fragmentMed = new  FragmentMed();
        fragmentOMP = new FragmentOMP();
        fragmentPriroda = new FragmentPriroda();
        fragmentRSCS = new FragmentRSCS();
        fragmentSocium = new FragmentSocium();
        fragmentTexnogen = new FragmentTexnogen();
        fragmentZOG = new FragmentZOG();
        fragmentTest1 = new FragmentTest1();
        fragmentTest2 = new FragmentTest2();
        fragmentTest3 = new FragmentTest3();

        drawer.openDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        FragmentManager fragmentManager = getFragmentManager();

        int id = item.getItemId();

        if (id == R.id.RSCS) {
            // Handle the camera action
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentRSCS())
                    .commit();

        } else if (id == R.id.GO) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentGO())
                    .commit();

        } else if (id == R.id.Priroda) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentPriroda())
                    .commit();

        } else if (id == R.id.Texnogen) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentTexnogen())
                    .commit();

        } else if (id == R.id.Socium) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentSocium())
                    .commit();

        }else if (id == R.id.OMP) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentOMP())
                    .commit();

        }else if (id == R.id.ZOG) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentZOG())
                    .commit();

        }else if (id == R.id.Lbez) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentLbez())
                    .commit();

        }else if (id == R.id.Med) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentMed())
                    .commit();

        }else if (id == R.id.Test1) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentTest1())
                    .commit();

        }else if (id == R.id.Test2) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentTest2())
                    .commit();

        }else if (id == R.id.Test3) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, new FragmentTest3())
                    .commit();
        }

        setTitle(item.getTitle());

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
