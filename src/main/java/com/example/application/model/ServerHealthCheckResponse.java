package com.example.application.model;

public class ServerHealthCheckResponse {

    private ServerState serverState;

    public ServerHealthCheckResponse() {
        serverState = new ServerState();
    }

    public ServerState getServerState() {
        return serverState;
    }
    
}
