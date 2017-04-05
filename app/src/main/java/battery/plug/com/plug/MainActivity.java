package battery.plug.com.plug;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    EditText t1,t2,t3,t4,t5,t6,t7,t8,t9,id;
    TextView batterytxt, plugStatus;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyReceiver mr=new MyReceiver();
        mr.RegisterAlarmManager(MainActivity.this.getApplicationContext());

        Intent intent = registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);



//        plugStatus = (TextView) findViewById(R.id.textView3);


        batterytxt = (TextView) findViewById(R.id.textView2);
        batterytxt.setText("Charge Remaining: " + level + "%");

//        plugStatus = (TextView) findViewById(R.id.textView3);
//        plugStatus.setText(" " + level + "%");

        pb=(ProgressBar) findViewById(R.id.batteryBar);
        pb.setProgress(level);

        //ID initialization
        id = (EditText)findViewById(R.id.espID);

        //BUTTON FOR PIN-4
        t1 = (EditText)findViewById(R.id.time4);
        t1.setText("3");
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin4/" + t1.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);

            }
        });

        //BUTTON FOR PIN-5
        t2 = (EditText)findViewById(R.id.time5);
        t2.setText("3");
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin5/" + t2.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });

        //BUTTON FOR PIN-2
        t3 = (EditText)findViewById(R.id.time2);
        t3.setText("3");
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin2/" + t3.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });

        //BUTTON FOR PIN-16
        t4 = (EditText)findViewById(R.id.time16);
        t4.setText("3");
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin16/" + t4.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });

        //BUTTON FOR PIN-0
        t5 = (EditText)findViewById(R.id.time0);
        t5.setText("3");
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin0/" + t5.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });

        //BUTTON FOR PIN-15
        t6 = (EditText)findViewById(R.id.time15);
        t6.setText("3");
        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin15/" + t6.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });

        //BUTTON FOR PIN-13
        t7 = (EditText)findViewById(R.id.time13);
        t7.setText("3");
        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin13/" + t7.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });

        //BUTTON FOR PIN-12
        t8 = (EditText)findViewById(R.id.time12);
        t8.setText("3");
        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin12/" + t8.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });

        //BUTTON FOR PIN-14
        t9 = (EditText)findViewById(R.id.time14);
        t9.setText("3");
        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                String url ="http://projectplug.club/pin14/" + t9.getText() + "/" + id.getText();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                Log.i("info","Response is: "+ response);
                                Toast.makeText(MainActivity.this , "Success",Toast.LENGTH_LONG).show();
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("error","That didn't work!");
                        Toast.makeText(MainActivity.this , "Fail ",Toast.LENGTH_LONG).show();
                    }
                });
                queue.add(stringRequest);


            }
        });



    }
}
