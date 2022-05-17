package com.example.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Sensors extends StringRequest {
    final static private String URL = "http://localhost:3000/devices";
    private Map<String, String> parameters;

    public Sensors(String sensor, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters=new HashMap<>();
        parameters.put("sensor",sensor);
    }

    @Override
    protected Map<String, String> getParams() {
        return parameters;
    }
}
