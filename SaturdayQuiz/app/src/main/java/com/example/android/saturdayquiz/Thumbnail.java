
package com.example.android.saturdayquiz;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

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
    @SerializedName("extension")
    @Expose
    private String extension;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("sizes")
    @Expose
    private List<Size> sizes = null;

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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

}
