package com.kinath.decorator;

/**
 * Created by kinath on 09/02/2018.
 */
//concrete component
public class Email implements IEmail
{
    private String content;

    public Email( String content )
    {
        this.content = content;
    }

    public String getContents()
    {
        //general email stuff
        return content;
    }
}