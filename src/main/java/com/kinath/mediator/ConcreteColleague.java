package com.kinath.mediator;

/**
 * Created by kinath on 09/02/2018.
 */
public class ConcreteColleague extends Colleague
{
    public ConcreteColleague( Mediator mediator )
    {
        super( mediator );
    }

    @Override
    public void receive( String message )
    {
        System.out.println("Concrete Colleague : Received : " + message);
    }
}
