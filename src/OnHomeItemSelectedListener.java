package fr.univpau.pauparkdroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class OnHomeItemSelectedListener implements OnItemSelectedListener {

	public OnHomeItemSelectedListener(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnHomeItemSelectedListener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long id) {
		Toast.makeText(
				parent.getContext(),
				"OnItemSelectedListener : "
						+ parent.getItemAtPosition(pos).toString(),
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
	}

}
