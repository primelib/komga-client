// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.client;

import feign.Param;
import feign.RequestLine;
import io.github.primelib.komga.client.models.AuthorDto;
import io.github.primelib.komga.client.models.PageAuthorDto;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.Nullable;

/**
 * KomgaClientreferentialControllerApi
 */
@Generated(value = "io.github.primelib.primecodegen")
public interface KomgaClientreferentialControllerApi {

    /**
    * GetAuthorsV2
    * 
    *
    * @param search 
    * @param role 
    * @param libraryId 
    * @param collectionId 
    * @param seriesId 
    * @param readlistId 
    * @param unpaged 
    * @param page Zero-based page index (0..N)
    * @param size The size of the page to be returned
    */
    @RequestLine("GET /api/v2/authors?search={search}&role={role}&libraryId={libraryId}&collectionId={collectionId}&seriesId={seriesId}&readlistId={readlistId}&unpaged={unpaged}&page={page}&size={size}")
    PageAuthorDto GetAuthorsV2(
            @Nullable @Param("search") String search,
            @Nullable @Param("role") String role,
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId,
            @Nullable @Param("seriesId") String seriesId,
            @Nullable @Param("readlistId") String readlistId,
            @Nullable @Param("unpaged") Boolean unpaged,
            @Nullable @Param("page") Integer page,
            @Nullable @Param("size") Integer size
    );

    /**
    * GetTagsV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/tags?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetTagsV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

    /**
    * GetTagsSeriesV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/tags/series?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetTagsSeriesV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

    /**
    * GetTagsBookV1
    * 
    *
    * @param seriesId 
    * @param readlistId 
    */
    @RequestLine("GET /api/v1/tags/book?seriesId={seriesId}&readlistId={readlistId}")
    String[] GetTagsBookV1(
            @Nullable @Param("seriesId") String seriesId,
            @Nullable @Param("readlistId") String readlistId
    );

    /**
    * GetSharingLabelsV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/sharing-labels?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetSharingLabelsV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

    /**
    * GetSeriesReleaseDatesV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/series/release-dates?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetSeriesReleaseDatesV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

    /**
    * GetPublishersV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/publishers?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetPublishersV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

    /**
    * GetLanguagesV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/languages?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetLanguagesV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

    /**
    * GetGenresV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/genres?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetGenresV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

    /**
    * GetAuthorsV1
    * 
    *
    * @param search 
    * @param libraryId 
    * @param collectionId 
    * @param seriesId 
    */
    @RequestLine("GET /api/v1/authors?search={search}&libraryId={libraryId}&collectionId={collectionId}&seriesId={seriesId}")
    AuthorDto[] GetAuthorsV1(
            @Nullable @Param("search") String search,
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId,
            @Nullable @Param("seriesId") String seriesId
    );

    /**
    * GetAuthorsRolesV1
    * 
    *
    */
    @RequestLine("GET /api/v1/authors/roles")
    String[] GetAuthorsRolesV1();

    /**
    * GetAuthorsNamesV1
    * 
    *
    * @param search 
    */
    @RequestLine("GET /api/v1/authors/names?search={search}")
    String[] GetAuthorsNamesV1(
            @Nullable @Param("search") String search
    );

    /**
    * GetAgeRatingsV1
    * 
    *
    * @param libraryId 
    * @param collectionId 
    */
    @RequestLine("GET /api/v1/age-ratings?libraryId={libraryId}&collectionId={collectionId}")
    String[] GetAgeRatingsV1(
            @Nullable @Param("libraryId") String libraryId,
            @Nullable @Param("collectionId") String collectionId
    );

}
