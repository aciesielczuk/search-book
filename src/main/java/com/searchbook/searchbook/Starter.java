package com.searchbook.searchbook;

import org.springframework.boot.CommandLineRunner;



public class Starter implements CommandLineRunner {


    private Object serverStatus;

    public Starter() {
    }

    @Override
    public void run(String... args) {
        System.out.println("witam");
        if (serverStatus.toString().equals("none"))
        System.out.println("Server is offline, you can't search any books");
    }

    public void setServerStatus(String serverStatus) {
    }

    public Object getServerStatus() {
        return serverStatus;
    }
}
