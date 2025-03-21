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
 * GetBooksDuplicatesV1
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetBooksDuplicatesV1OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

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
     * Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
     */
    // TODO: annotations
    private String[] sort;

    /**
     * Constructs a validated instance of {@link GetBooksDuplicatesV1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetBooksDuplicatesV1OperationSpec(Consumer<GetBooksDuplicatesV1OperationSpec> spec) {
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
