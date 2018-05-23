package com.example.aris_rizaldi.jhotel_android_muhammadarisrizaldi;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

/**
 * Created by User on 5/6/2018.
 */

public class PesananFetchRequest extends StringRequest {
    final private static String PesanFetch_URL = "http://192.168.43.127:8080/pesanancustomer/";
    //final private static String PesanFetch_URL = "http://10.0.2.2:8080/pesanancustomer/" ;
    private Map<String,String> params;

    public PesananFetchRequest( String id_customer,Response.Listener<String> listener)
    {
        super(Method.GET, PesanFetch_URL +id_customer,listener,null);
        params = new HashMap<>();
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
