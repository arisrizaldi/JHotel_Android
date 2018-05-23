package com.example.aris_rizaldi.jhotel_android_muhammadarisrizaldi;

import com.android.volley.Request;
import com.android.volley.Response;


import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class MenuRequest extends StringRequest {
    //private static final String Regis_URL = "http://10.0.2.2:8080/newcustomer";
    private static final String Menu_URL = "http://192.168.43.127:8080/vacantrooms";
    private Map<String, String> params;
    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Menu_URL, listener, null);
        params = new HashMap<>();

    }

    @Override
    public Map<String, String> getParams()
    {
        return params;
    }


}

