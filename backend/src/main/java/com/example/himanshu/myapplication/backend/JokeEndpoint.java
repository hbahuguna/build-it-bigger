/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.himanshu.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "jokeApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.himanshu.example.com",
    ownerName = "backend.myapplication.himanshu.example.com",
    packagePath=""
  )
)
public class JokeEndpoint {

    /** A simple endpoint method that returns a joke */
    @ApiMethod(name = "putJoke")
    public JokeBean putJoke(JokeBean joke) {
        return joke;
    }

}
