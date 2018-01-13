
package com.example.android.saturdayquiz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExampleLogin {

    @SerializedName("status")
    @Expose
    private StatusL status;
    @SerializedName("data")
    @Expose
    private DataL data;

    public StatusL getStatus() {
        return status;
    }

    public void setStatus(StatusL status) {
        this.status = status;
    }

    public DataL getData() {
        return data;
    }

    public void setData(DataL data) {
        this.data = data;
    }

}
