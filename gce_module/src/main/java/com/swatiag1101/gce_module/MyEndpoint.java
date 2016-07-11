/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.swatiag1101.gce_module;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.swatiag1101.JokesSupply;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "gce_module.swatiag1101.com",
    ownerName = "gce_module.swatiag1101.com",
    packagePath=""
  )
)
public class MyEndpoint {

    JokesSupply jokesSupply = new JokesSupply();

    /** A simple endpoint method that takes a name and says Hi back */
   /* @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        //response.setData("Hi, " + name);
        response.setData(jokesSupply.getJoke());
        return response;
    }*/

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        MyBean response = new MyBean();
        //response.setData("Hi, " + name);
        response.setData(jokesSupply.getJoke());
        return response;
    }
}
