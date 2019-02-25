package homework.android.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName, lastName,birthday,address,email;
    RadioButton male,female;
    CheckBox agree;
    Button selectBirtday,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        firstName = (EditText)findViewById( R.id.etxt_fn );
        lastName = (EditText)findViewById( R.id.etxt_ln );
        birthday = (EditText)findViewById( R.id.etxt_birthday );
        address = (EditText)findViewById( R.id.etxt_address );
        email = (EditText)findViewById( R.id.etxt_email );
        male = (RadioButton) findViewById( R.id.rBtn_male );
        female = (RadioButton) findViewById( R.id.rBtn_female );
        agree = (CheckBox)findViewById(R.id.cBox_agree );
        selectBirtday = (Button)findViewById( R.id.btn_select );
        register = (Button)findViewById( R.id.btn_register );

        register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean check = false;
                String str = String.valueOf( firstName.getText());

                if(str.length() == 0){
                    check = true;
                    firstName.setHint("input First Name ?");
                    firstName.setHintTextColor( getResources().getColor( android.R.color.holo_red_light ));
                }

                str = String.valueOf( lastName.getText() );

                if(str.length() == 0){
                    check = true;
                    lastName.setHint("input Last Name ?");
                    lastName.setHintTextColor( getResources().getColor( android.R.color.holo_red_light ));
                }

                str = String.valueOf( birthday.getText() );

                if(str.length() == 0){
                    check = true;
                    birthday.setHint("Birthday not already !!");
                    birthday.setHintTextColor( getResources().getColor( android.R.color.holo_red_light ));
                }

                str = String.valueOf( address.getText() );

                if(str.length() == 0){
                    check = true;
                    address.setHint("Address not already !!");
                    address.setHintTextColor( getResources().getColor( android.R.color.holo_red_light ));
                }

                str = String.valueOf( email.getText() );

                if(str.length() == 0){
                    check = true;
                    email.setHint("Email not already !!");
                    email.setHintTextColor( getResources().getColor( android.R.color.holo_red_light ));
                }

                if(!(agree.isChecked())){
                    check = true;
                    agree.setText( "I agree Terms of Use (need checked)" );
                    agree.setTextColor( getResources().getColor( android.R.color.holo_red_light ));
                }
                else{
                    agree.setText( "I agree Terms of Use" );
                    agree.setTextColor( getResources().getColor( android.R.color.black ));
                }

                if(male.isChecked() || female.isChecked()){
                    male.setTextColor( getResources().getColor( android.R.color.black ) );
                    female.setTextColor( getResources().getColor( android.R.color.black ) );
                }
                else{
                    check = true;
                    male.setTextColor( getResources().getColor( android.R.color.holo_red_light ) );
                    female.setTextColor( getResources().getColor( android.R.color.holo_red_light ) );
                }


                if(check == true){
                    Toast.makeText( getApplicationContext(),"Some field not input !!",Toast.LENGTH_LONG ).show();
                }else{
                    Toast.makeText( getApplicationContext(),"All field available!!",Toast.LENGTH_LONG ).show();
                }
            }
        } );

    }
}
