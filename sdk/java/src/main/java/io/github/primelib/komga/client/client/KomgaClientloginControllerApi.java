// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.client;

import feign.RequestLine;
import javax.annotation.processing.Generated;

/**
 * KomgaClientloginControllerApi
 */
@Generated(value = "io.github.primelib.primecodegen")
public interface KomgaClientloginControllerApi {

    /**
    * GetLoginSetCookieV1
    * 
    *
    */
    @RequestLine("GET /api/v1/login/set-cookie")
    void GetLoginSetCookieV1();

}
