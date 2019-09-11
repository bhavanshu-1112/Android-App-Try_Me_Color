package com.example.try_me_color;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {
private Button button;
private View windowView;
private int[] colors;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 colors = new int[]{
		Color.RED,Color.GRAY,Color.BLUE,Color.GREEN,Color.DKGRAY,Color.MAGENTA,Color.LTGRAY
};
	windowView = (View)findViewById(R.id.windowViewId);

		button = (Button)findViewById(R.id.button4);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int colorArrayLength = colors.length;
           Random r = new Random();
           int rnum = r.nextInt(colorArrayLength);

				windowView.setBackgroundColor(colors[rnum]);

			}
		});
	}
}
