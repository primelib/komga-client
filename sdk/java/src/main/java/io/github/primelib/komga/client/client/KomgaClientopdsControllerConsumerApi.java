// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.client;

import io.github.primelib.komga.client.models.OpdsFeed;
import io.github.primelib.komga.client.models.OpenSearchDescription;
import io.github.primelib.komga.client.operations.GetOpdsV12BookByBookIDThumbnailSmallV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12BooksLatestV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12CollectionByIDV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12CollectionsV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12KeepReadingV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12LibraryByIDV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12OndeckV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12PublishersV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12ReadlistByIDV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12ReadlistsV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12SeriesByIDV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12SeriesLatestV1OperationSpec;
import io.github.primelib.komga.client.operations.GetOpdsV12SeriesV1OperationSpec;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;

/**
 * KomgaClientopdsControllerConsumerApi
 */
@Generated(value = "io.github.primelib.primecodegen")
public class KomgaClientopdsControllerConsumerApi {
    private final KomgaClientopdsControllerApi api;

    public KomgaClientopdsControllerConsumerApi(KomgaClientopdsControllerApi api) {
        this.api = api;
    }


    /**
    * GetOpdsV12SeriesV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>search: </li>
    *   <li>publisher: </li>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12SeriesV1(Consumer<GetOpdsV12SeriesV1OperationSpec> spec) {
        GetOpdsV12SeriesV1OperationSpec r = new GetOpdsV12SeriesV1OperationSpec(spec);
        return api.GetOpdsV12SeriesV1(r.search(), r.publisher(), r.page());
    }

    /**
    * GetOpdsV12SeriesByIDV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>id: </li>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12SeriesByIDV1(Consumer<GetOpdsV12SeriesByIDV1OperationSpec> spec) {
        GetOpdsV12SeriesByIDV1OperationSpec r = new GetOpdsV12SeriesByIDV1OperationSpec(spec);
        return api.GetOpdsV12SeriesByIDV1(r.id(), r.page());
    }

    /**
    * GetOpdsV12SeriesLatestV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12SeriesLatestV1(Consumer<GetOpdsV12SeriesLatestV1OperationSpec> spec) {
        GetOpdsV12SeriesLatestV1OperationSpec r = new GetOpdsV12SeriesLatestV1OperationSpec(spec);
        return api.GetOpdsV12SeriesLatestV1(r.page());
    }

    /**
    * GetOpdsV12SearchV1
    * 
    *
    */
    public OpenSearchDescription GetOpdsV12SearchV1() {
        return api.GetOpdsV12SearchV1();
    }

    /**
    * GetOpdsV12ReadlistsV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12ReadlistsV1(Consumer<GetOpdsV12ReadlistsV1OperationSpec> spec) {
        GetOpdsV12ReadlistsV1OperationSpec r = new GetOpdsV12ReadlistsV1OperationSpec(spec);
        return api.GetOpdsV12ReadlistsV1(r.page());
    }

    /**
    * GetOpdsV12ReadlistByIDV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>id: </li>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12ReadlistByIDV1(Consumer<GetOpdsV12ReadlistByIDV1OperationSpec> spec) {
        GetOpdsV12ReadlistByIDV1OperationSpec r = new GetOpdsV12ReadlistByIDV1OperationSpec(spec);
        return api.GetOpdsV12ReadlistByIDV1(r.id(), r.page());
    }

    /**
    * GetOpdsV12PublishersV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12PublishersV1(Consumer<GetOpdsV12PublishersV1OperationSpec> spec) {
        GetOpdsV12PublishersV1OperationSpec r = new GetOpdsV12PublishersV1OperationSpec(spec);
        return api.GetOpdsV12PublishersV1(r.page());
    }

    /**
    * GetOpdsV12OndeckV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12OndeckV1(Consumer<GetOpdsV12OndeckV1OperationSpec> spec) {
        GetOpdsV12OndeckV1OperationSpec r = new GetOpdsV12OndeckV1OperationSpec(spec);
        return api.GetOpdsV12OndeckV1(r.page());
    }

    /**
    * GetOpdsV12LibrariesV1
    * 
    *
    */
    public OpdsFeed GetOpdsV12LibrariesV1() {
        return api.GetOpdsV12LibrariesV1();
    }

    /**
    * GetOpdsV12LibraryByIDV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>id: </li>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12LibraryByIDV1(Consumer<GetOpdsV12LibraryByIDV1OperationSpec> spec) {
        GetOpdsV12LibraryByIDV1OperationSpec r = new GetOpdsV12LibraryByIDV1OperationSpec(spec);
        return api.GetOpdsV12LibraryByIDV1(r.id(), r.page());
    }

    /**
    * GetOpdsV12KeepReadingV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12KeepReadingV1(Consumer<GetOpdsV12KeepReadingV1OperationSpec> spec) {
        GetOpdsV12KeepReadingV1OperationSpec r = new GetOpdsV12KeepReadingV1OperationSpec(spec);
        return api.GetOpdsV12KeepReadingV1(r.page());
    }

    /**
    * GetOpdsV12CollectionsV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12CollectionsV1(Consumer<GetOpdsV12CollectionsV1OperationSpec> spec) {
        GetOpdsV12CollectionsV1OperationSpec r = new GetOpdsV12CollectionsV1OperationSpec(spec);
        return api.GetOpdsV12CollectionsV1(r.page());
    }

    /**
    * GetOpdsV12CollectionByIDV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>id: </li>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12CollectionByIDV1(Consumer<GetOpdsV12CollectionByIDV1OperationSpec> spec) {
        GetOpdsV12CollectionByIDV1OperationSpec r = new GetOpdsV12CollectionByIDV1OperationSpec(spec);
        return api.GetOpdsV12CollectionByIDV1(r.id(), r.page());
    }

    /**
    * GetOpdsV12CatalogV1
    * 
    *
    */
    public OpdsFeed GetOpdsV12CatalogV1() {
        return api.GetOpdsV12CatalogV1();
    }

    /**
    * GetOpdsV12BookByBookIDThumbnailSmallV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>bookId: </li>
    * </ul>
    */
    public void GetOpdsV12BookByBookIDThumbnailSmallV1(Consumer<GetOpdsV12BookByBookIDThumbnailSmallV1OperationSpec> spec) {
        GetOpdsV12BookByBookIDThumbnailSmallV1OperationSpec r = new GetOpdsV12BookByBookIDThumbnailSmallV1OperationSpec(spec);
        api.GetOpdsV12BookByBookIDThumbnailSmallV1(r.bookId());
    }

    /**
    * GetOpdsV12BooksLatestV1
    * 
    *
    * @param spec a consumer that creates the payload for this operation. Supports the following properties:
    * <ul>
    *   <li>page: Zero-based page index (0..N)</li>
    * </ul>
    */
    public OpdsFeed GetOpdsV12BooksLatestV1(Consumer<GetOpdsV12BooksLatestV1OperationSpec> spec) {
        GetOpdsV12BooksLatestV1OperationSpec r = new GetOpdsV12BooksLatestV1OperationSpec(spec);
        return api.GetOpdsV12BooksLatestV1(r.page());
    }

}
