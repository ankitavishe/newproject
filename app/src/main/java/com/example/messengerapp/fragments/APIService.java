package com.example.messengerapp.fragments;

import com.example.messengerapp.Notifications.MyResponse;
import com.example.messengerapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{
    @Headers({
            "Content=Type:application/json",
            "Authorization:key=AAAAu9PoxEA:APA91bEEpYguvw03s7MvINHccYS8O7C-AUU3Zxa10zAOD4Eu44v9JlUnCHgSAdIl43fWS-yhf6qODF51c8Pze_TU53l3EaQdlJSf8mmqoiRd38J8dG5ZjBgL7yF3hb5gWiyZNSg3ivKy"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
