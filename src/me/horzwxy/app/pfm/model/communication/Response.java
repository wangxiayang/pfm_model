package me.horzwxy.app.pfm.model.communication;

import com.google.gson.Gson;

/**
 * Created by horz on 9/13/13.
 */
public abstract class Response<T extends Response> {

    protected Gson gson;

    public T parseResponse(String gsonString) {
        return null;
    }
}
