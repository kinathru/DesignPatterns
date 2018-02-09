package com.kinath.decorator;

/**
 * Created by kinath on 09/02/2018.
 */
//concrete decorator
public class SecureEmailDecorator extends EmailDecorator
{
    private String content;

    public SecureEmailDecorator( IEmail basicEmail )
    {
        originalEmail = basicEmail;
    }

    public String getContents()
    {            //  secure original
        content = encrypt( originalEmail.getContents() );
        return content;
    }

    private String encrypt( String message )
    {      //encrypt the string
        String encryptedMessage = message + "enc";
        return encryptedMessage;
    }
}