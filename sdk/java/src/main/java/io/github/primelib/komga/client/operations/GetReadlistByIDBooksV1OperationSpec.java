// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.operations;

import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * GetReadlistByIDBooksV1
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetReadlistByIDBooksV1OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * 
     */
    // TODO: annotations
    private String id;

    /**
     * 
     */
    // TODO: annotations
    private String[] libraryId;

    /**
     * 
     */
    // TODO: annotations
    private String[] readStatus;

    /**
     * 
     */
    // TODO: annotations
    private String[] tag;

    /**
     * 
     */
    // TODO: annotations
    private String[] mediaStatus;

    /**
     * 
     */
    // TODO: annotations
    private Boolean deleted;

    /**
     * 
     */
    // TODO: annotations
    private Boolean unpaged;

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
     * Author criteria in the format: name,role. Multiple author criteria are supported.
     */
    // TODO: annotations
    private String[] author;

    /**
     * Constructs a validated instance of {@link GetReadlistByIDBooksV1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetReadlistByIDBooksV1OperationSpec(Consumer<GetReadlistByIDBooksV1OperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
