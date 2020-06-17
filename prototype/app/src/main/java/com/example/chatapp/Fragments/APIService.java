package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Conect-Type:application/json",
                    "Authorization:key=AAAA4iIP2k0:APA91bFeIruWOIcPcnZrnoBOY5c2FpD4470-HIKoDkpXEbqX1i-VZ8dYRW-CTmKqX_PQl0sF5WeqR4KWefOHlFDyWooCQOc7vQAuOaDIypk14QcUz1woJDIcLHk7-t9Gc3nia2aNRefr"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
