// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.operations;

import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * GetSeriesV1
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetSeriesV1OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * 
     */
    // TODO: annotations
    private String search;

    /**
     * 
     */
    // TODO: annotations
    private String[] libraryId;

    /**
     * 
     */
    // TODO: annotations
    private String[] collectionId;

    /**
     * 
     */
    // TODO: annotations
    private String[] status;

    /**
     * 
     */
    // TODO: annotations
    private String[] readStatus;

    /**
     * 
     */
    // TODO: annotations
    private String[] publisher;

    /**
     * 
     */
    // TODO: annotations
    private String[] language;

    /**
     * 
     */
    // TODO: annotations
    private String[] genre;

    /**
     * 
     */
    // TODO: annotations
    private String[] tag;

    /**
     * 
     */
    // TODO: annotations
    private String[] ageRating;

    /**
     * 
     */
    // TODO: annotations
    private String[] releaseYear;

    /**
     * 
     */
    // TODO: annotations
    private String[] sharingLabel;

    /**
     * 
     */
    // TODO: annotations
    private Boolean deleted;

    /**
     * 
     */
    // TODO: annotations
    private Boolean complete;

    /**
     * 
     */
    // TODO: annotations
    private Boolean oneshot;

    /**
     * 
     */
    // TODO: annotations
    private Boolean unpaged;

    /**
     * Search by regex criteria, in the form: regex,field. Supported fields are TITLE and TITLE_SORT.
     */
    // TODO: annotations
    private String searchRegex;

    /**
     * Zero-based page index (0..N)
     */
    // TODO: annotations
    private Integer page;

    /**
     * The size of the page to be returned
     */
    // TODO: annotations
    private Integer size;

    /**
     * Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
     */
    // TODO: annotations
    private String[] sort;

    /**
     * Author criteria in the format: name,role. Multiple author criteria are supported.
     */
    // TODO: annotations
    private String[] author;

    /**
     * Constructs a validated instance of {@link GetSeriesV1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSeriesV1OperationSpec(Consumer<GetSeriesV1OperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
