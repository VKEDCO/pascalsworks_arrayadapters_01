package org.vkedco.mobappdev.listviewofpascalsworks_arrayadptrs_01;

/*
 ************************************************************ 
 * IDE: Eclipse Juno
 * OS: Ubuntu 12.04 LTS
 * bugs to vladimir dot kulyukin at gmail dot com
 ************************************************************
 */

import com.example.listviewofpascalsworks_arrayadptrs_01.R;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewOfPascalsWorksAct_01 extends ListActivity
	implements OnItemClickListener
{

	String[] mPascalsWorks = null;
	Resources mRes = null;
	final static int NUM_WORKS = 5;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.list_view_of_pascals_works_act_layout_01);
        this.mPascalsWorks = new String[NUM_WORKS];
        this.mRes = this.getResources();
        
        
        this.mPascalsWorks[0] = this.mRes.getString(R.string.discourses);
        this.mPascalsWorks[1] = this.mRes.getString(R.string.geometrical_spirit);
        this.mPascalsWorks[2] = this.mRes.getString(R.string.persuasion);
        this.mPascalsWorks[3] = this.mRes.getString(R.string.vacuum_01);
        this.mPascalsWorks[4] = this.mRes.getString(R.string.vacuum_02);
        
        ListView lv = this.getListView();
        ArrayAdapter<String> adptr = new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1, 
        		mPascalsWorks
        		);
        lv.setAdapter(adptr);
        lv.setOnItemClickListener(this);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_view_of_pascals_works_act_01, menu);
        return true;
    }


	@Override
	public void onItemClick(AdapterView<?> parent, View child, int position, long id) {
		// TODO Auto-generated method stub
		String msg = "";
		msg += "PARENT = " + parent.toString() + "\n";
		msg += "VIEW = " + child.toString() + "\n";
		msg += "VIEW's TEXT = " + ((TextView) child).getText().toString() + "\n";
		msg += "POSITION = " + Integer.toString(position) + "\n";
		msg += "ID = " + Long.toString(id);
		Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
	}
    
}
