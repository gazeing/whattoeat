package gazeing.whattoeat;


import gazeing.whattoeat.R;

import gazeing.whattoeat.TabView;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		 Init();
	}

	private void Init() {
		 TabHost tabHost=getTabHost();  
	        
	        TabView view = null;  
	          
	          
	        view = new TabView(this, R.drawable.fav_icon, R.drawable.fav_icon,"Shopping");   
	        //view.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.backgn));  
	              
	        TabSpec historySpec=tabHost.newTabSpec("Shopping");  
	        historySpec.setIndicator(view);  
	        Intent historyIntent = new Intent(this, ShoppingActivity.class);  
	        historySpec.setContent(historyIntent);  
	          
	        view = new TabView(this, R.drawable.fav_icon, R.drawable.fav_icon,"Dinner");  
	        //view.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.backgn));  
	          
	        TabSpec moreSpec=tabHost.newTabSpec("Dinner");  
	        moreSpec.setIndicator(view);  
	        Intent moreIntent = new Intent(this,DinnerActivity.class);  
	        moreSpec.setContent(moreIntent);  
	          
	          
	        view = new TabView(this, R.drawable.fav_icon, R.drawable.fav_icon,"Recipe");    
	        //view.setBackgroundDrawable(this.getResources().getDrawable(R.drawable.backgn));  
	          
	        TabSpec favoriteSpec = tabHost.newTabSpec("Recipe");  
	        favoriteSpec.setIndicator(view);  
	        Intent favoriteIntent = new Intent(this, RecipeActivity.class);  
	        favoriteSpec.setContent(favoriteIntent); 
	        

	          
	  
	                  
	        tabHost.addTab(historySpec);  
	        tabHost.addTab(favoriteSpec);  
	        tabHost.addTab(moreSpec);
	       
	        tabHost.setCurrentTabByTag("Shopping"); 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
