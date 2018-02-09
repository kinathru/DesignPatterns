package com.kinath.mediator;

/**
 * Created by kinath on 09/02/2018.
 */
public class MobileColleague extends Colleague
{
    public MobileColleague( Mediator mediator )
    {
        super( mediator );
    }

    @Override public void receive( String message )
    {
        System.out.println("Mobile Colleague : Received : " + message);
    }
}
