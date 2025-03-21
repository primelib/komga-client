// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.operations;

import io.github.primelib.komga.client.models.ReadProgressUpdateDto;
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
 * PatchBookByBookIDReadProgressV1
 * <p>
 * Mark book as read and/or change page progress
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class PatchBookByBookIDReadProgressV1OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * 
     */
    // TODO: annotations
    private String bookId;

    /**
     * 
     */
    // TODO: annotations
    private ReadProgressUpdateDto payload;

    /**
     * Constructs a validated instance of {@link PatchBookByBookIDReadProgressV1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PatchBookByBookIDReadProgressV1OperationSpec(Consumer<PatchBookByBookIDReadProgressV1OperationSpec> spec) {
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
        Objects.requireNonNull(bookId, "bookId is a required parameter!");
        Objects.requireNonNull(payload, "payload is a required parameter!");
    }
}
