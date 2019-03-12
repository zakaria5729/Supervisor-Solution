package com.zakariahossain.supervisorsolution.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class AcceptedGroupList implements Serializable {

    @SerializedName("error")
    private Boolean error;

    @SerializedName("accepted_group_list")
    private List<List<RequestedOrAcceptedGroup>> acceptedGroupList = null;

    public Boolean getError() {
        return error;
    }

    public List<List<RequestedOrAcceptedGroup>> getAcceptedGroupList() {
        return acceptedGroupList;
    }
}
