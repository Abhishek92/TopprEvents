package com.android.topprevents.api;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hp pc on 25-09-2016.
 */
public interface TopperEventService {

    @GET("api/toppr_events?type=json&query=list_events")
    Call<EventDataModel> getEventList();
}
