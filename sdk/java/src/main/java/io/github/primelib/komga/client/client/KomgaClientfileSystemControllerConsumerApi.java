// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.client;

import io.github.primelib.komga.client.models.DirectoryListingDto;
import io.github.primelib.komga.client.operations.PostFilesystemV1OperationSpec;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;

/**
 * KomgaClientfileSystemControllerConsumerApi
 */
@Generated(value = "io.github.primelib.primecodegen")
public class KomgaClientfileSystemControllerConsumerApi {
    private final KomgaClientfileSystemControllerApi api;

    public KomgaClientfileSystemControllerConsumerApi(KomgaClientfileSystemControllerApi api) {
        this.api = api;
    }


    /**
    * PostFilesystemV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>payload: </li>
    * </ul>
    */
    public DirectoryListingDto PostFilesystemV1(Consumer<PostFilesystemV1OperationSpec> spec) {
        PostFilesystemV1OperationSpec r = new PostFilesystemV1OperationSpec(spec);
        return api.PostFilesystemV1(r.payload());
    }

}
