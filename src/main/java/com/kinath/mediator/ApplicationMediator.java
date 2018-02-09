package com.kinath.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kinath on 09/02/2018.
 */
public class ApplicationMediator implements Mediator
{
    private List<Colleague> colleagues;

    public ApplicationMediator()
    {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague)
    {
        colleagues.add( colleague );
    }

    public void send( String message, final Colleague originator )
    {
        colleagues.stream().filter( c -> c != originator ).forEach( c -> c.receive( message ) );
    }
}
