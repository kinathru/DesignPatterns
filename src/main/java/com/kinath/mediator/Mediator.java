package com.kinath.mediator;

/**
 * Created by kinath on 09/02/2018.
 */
public interface Mediator
{
    void send(String message, Colleague mediator);
}
