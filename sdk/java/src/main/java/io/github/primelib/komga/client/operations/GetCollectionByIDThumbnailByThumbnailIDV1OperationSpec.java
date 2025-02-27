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
 * GetCollectionByIDThumbnailByThumbnailIDV1
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Generated(value = "io.github.primelib.primecodegen")
public class GetCollectionByIDThumbnailByThumbnailIDV1OperationSpec {
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
    private String thumbnailId;

    /**
     * Constructs a validated instance of {@link GetCollectionByIDThumbnailByThumbnailIDV1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCollectionByIDThumbnailByThumbnailIDV1OperationSpec(Consumer<GetCollectionByIDThumbnailByThumbnailIDV1OperationSpec> spec) {
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
        Objects.requireNonNull(thumbnailId, "thumbnailId is a required parameter!");
    }
}
