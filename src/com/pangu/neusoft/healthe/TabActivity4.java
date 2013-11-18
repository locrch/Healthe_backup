package com.pangu.neusoft.healthe;

import java.util.Random;

import com.baidu.mapapi.search.c;
import com.pangu.neusoft.tools.SysApplication;
import com.pangu.neusoft.tools.update.UpdateOperation;




import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class TabActivity4 extends Activity  {	
	Button more_help,more_info,more_update;
	
	ProgressDialog pd;
	
	Handler handler;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.tab4_more);
		more_help = (Button)findViewById(R.id.more_help);
		more_info = (Button)findViewById(R.id.more_info);
		more_update = (Button)findViewById(R.id.more_update);
		
		
		
		more_update.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				
				UpdateOperation update=new UpdateOperation(TabActivity4.this);
				
		    	update.checkUpdate();
		    	
				
			}
		});
		
		more_info.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				startActivity(new Intent(TabActivity4.this,VersionInfoActivity.class));
			}
		});
		
		more_help.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				startActivity(new Intent(TabActivity4.this,HelpActivity.class));
			}
		});
	}
	
	
}