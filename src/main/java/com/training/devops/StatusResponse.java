package com.training.devops;


public class StatusResponse {
    private String status;
    
    public StatusResponse(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
