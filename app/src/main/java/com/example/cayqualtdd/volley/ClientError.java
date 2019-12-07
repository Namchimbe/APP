package com.example.cayqualtdd.volley;

import com.android.volley.NetworkResponse;
import com.android.volley.ServerError;

public class ClientError extends ServerError {
    public ClientError(NetworkResponse networkResponse) {
        super(networkResponse);
    }
    public ClientError() {
        super();
    }
}