package com.example.aris_rizaldi.jhotel_android_muhammadarisrizaldi;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MenuRequest extends StringRequest {

    private static final String Login_URL = "http://192.168.0.9/logincust";
    //private Map<String, String> params;

    public MenuRequest(Response.Listener<String> listener) {
        super(Request.Method.GET, Login_URL, listener, null);
        /*params = new HashMap<>();
        params.put("email",email);
        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    */}

}
