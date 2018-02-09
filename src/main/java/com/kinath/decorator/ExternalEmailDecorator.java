package com.kinath.decorator;

/**
 * Created by kinath on 09/02/2018.
 */
//concrete decorator
public class ExternalEmailDecorator extends EmailDecorator
{
    private String content;

    public ExternalEmailDecorator( IEmail basicEmail )
    {
        originalEmail = basicEmail;
    }

    public String getContents()
    {   //  secure original
        content = addDisclaimer( originalEmail.getContents() );
        return content;
    }

    private String addDisclaimer( String message )
    {   //append company disclaimer to message
        return message + "\n Company Disclaimer";
    }
}