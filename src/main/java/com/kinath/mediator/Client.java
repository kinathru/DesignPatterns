package com.kinath.mediator;

/**
 * Created by kinath on 09/02/2018.
 */
public class Client
{
    public static void main( String[] args )
    {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague concreteColleague = new ConcreteColleague( mediator );
        MobileColleague mobileColleague = new MobileColleague( mediator );

        mediator.addColleague( concreteColleague );
        mediator.addColleague( mobileColleague );

        concreteColleague.send( "Concrete Message" );
        mobileColleague.send( "Mobile Message" );
    }
}
