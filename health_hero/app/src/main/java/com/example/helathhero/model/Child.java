package com.example.helathhero.model;

import javafx.concurrent.Task;

import java.util.List;

class Child
{
    private Integer id;
    private String childUsername;
    private String parentUsername;

    private List<Task> tasks;

    private int level;
    private int XP;

    private String characterName;
    private byte[] characterImage; // CAN BE CHANGED TO ANOTHER FILE FORMAT

    public void logIn(String childUsername)
    {
        //GET DATA FROM SERVER
    }

    public void register(String childUsername, String parentUsername)
    {
        //REGISTER AND GET DATA FROM SERVER
    }

    public void completeTask(int id, byte[] image)
    {
        // SEND REQUEST TO SERVER
    }

    public byte[] getCharacterImage(){return characterImage;}

    public String getCharacterName(){return characterName;}

    public List<Task> getTasks(){return tasks;}

    public int getXP(){return XP;}

    public int getLevel(){return level;}

}