package com.dhootha.listview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

// For List View extend Activity replacing AppCompatActivity or ActionBarActivity.
public class MainActivity extends Activity {

    ListView listView;
    //TextView headerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the Header Title of the List View in java
        TextView title = new TextView(getApplicationContext());
        title.setText("List View Header Title.");
        title.setText(R.string.header_title);
        //title.setHeight(20);
        title.setBackgroundColor(Color.RED);
        title.setTextColor(Color.parseColor("#000000"));
        title.setTextColor(Color.BLACK);

        String[] values = new String[]{"One","Two","Three","Four","Five","Six","Seven"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_view,values);

        // Create the listView object from activity_main.xml
        listView = (ListView)findViewById(R.id.numbers);
        listView.addHeaderView(title);
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
