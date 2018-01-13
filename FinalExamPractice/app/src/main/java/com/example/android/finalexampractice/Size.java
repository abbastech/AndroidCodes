
package com.example.android.finalexampractice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Size {

    @SerializedName("media_id")
    @Expose
    private String mediaId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("media_parent")
    @Expose
    private String mediaParent;
    @SerializedName("size")
    @Expose
    private String size;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMediaParent() {
        return mediaParent;
    }

    public void setMediaParent(String mediaParent) {
        this.mediaParent = mediaParent;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
