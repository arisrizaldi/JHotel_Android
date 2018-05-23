package com.example.aris_rizaldi.jhotel_android_muhammadarisrizaldi;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class PesananSelesaiRequest extends StringRequest {

    private static final String SelesaiPesanan_URL = "http://192.168.43.127:8080/finishpesanan";
    //private static final String SelesaiPesanan_URL = "http://10.0.2.2:8080/finishpesanan";
    private Map<String,String> params;

    public PesananSelesaiRequest(String id_pesanan,Response.Listener<String> listener) {
        super(Method.POST, SelesaiPesanan_URL,listener, null);
        params = new HashMap<>();
        params.put("id_pesanan",id_pesanan);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

