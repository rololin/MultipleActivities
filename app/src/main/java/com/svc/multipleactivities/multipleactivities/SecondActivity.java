package com.svc.multipleactivities.multipleactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by shyam on 1/16/15.
 */
public class SecondActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);


        Intent activityThatCalled = getIntent();

        String PreviousActivity = activityThatCalled.getExtras().getString("calling Activity");

        TextView CallingActivityTv =  (TextView) findViewById(R.id.calling_activity_info_text_view);
        CallingActivityTv.setText(PreviousActivity);


    }

    public void submitname(View view) {
        EditText usersname = (EditText) findViewById(R.id.edittextname);
        String usersName = String.valueOf(usersname.getText());

        Intent goback = new Intent();
        goback.putExtra("UsersName",usersName);

        setResult(RESULT_OK,goback);
        finish();

    }
}
