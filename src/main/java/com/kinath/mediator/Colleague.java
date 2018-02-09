package com.kinath.mediator;

/**
 * Created by kinath on 09/02/2018.
 */
public abstract class Colleague
{
    private Mediator mediator;

    public Colleague( Mediator mediator )
    {
        this.mediator = mediator;
    }

    public void send( String message )
    {
        mediator.send( message, this );
    }

    public Mediator getMediator()
    {
        return mediator;
    }

    public abstract void receive( String message );
}
