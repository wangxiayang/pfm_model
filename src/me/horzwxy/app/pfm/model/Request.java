package me.horzwxy.app.pfm.model;

import com.google.gson.Gson;

/**
 * Created by horz on 9/13/13.
 */
public abstract class Request<T extends PFMData> {

  protected T attachment;
  protected Gson gson;

  public Request(T attachment) {
    this.gson = new Gson();
    this.attachment = attachment;
  }

  public final T getAttachment() {
    return attachment;
  }

  public final String getPostContent() {
    return gson.toJson(attachment);
  }

  public abstract String getServletPattern();
}
