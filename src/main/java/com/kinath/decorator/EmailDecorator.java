package com.kinath.decorator;

/**
 * Created by kinath on 09/02/2018.
 */
public abstract class EmailDecorator implements IEmail
{   //wrapped component
    IEmail originalEmail;
}