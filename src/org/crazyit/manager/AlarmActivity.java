package org.crazyit.manager;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.MediaPlayer;
import android.os.Bundle;

public class AlarmActivity extends Activity
{
	MediaPlayer alarmMusic;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		alarmMusic = MediaPlayer.create(this, R.raw.alarm);
		alarmMusic.setLooping(true);
		alarmMusic.start();
		new AlertDialog.Builder(AlarmActivity.this)
			.setTitle("Title")
			.setMessage("Message")
			.setPositiveButton(
				"Yes" ,
				new OnClickListener()
				{
					@Override
					public void onClick(DialogInterface dialog , int which)
					{
						alarmMusic.stop();
						AlarmActivity.this.finish();
					}
				}
			)
			.show();
	}
}
