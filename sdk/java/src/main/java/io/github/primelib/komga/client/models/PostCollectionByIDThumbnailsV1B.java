// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package io.github.primelib.komga.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.function.Consumer;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;

/**
 * PostCollectionByIDThumbnailsV1B
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("PostCollectionByIDThumbnailsV1B")
@JsonPropertyOrder({
    "file"
})
@Generated(value = "io.github.primelib.primecodegen")
public class PostCollectionByIDThumbnailsV1B {

    @JsonProperty("file")
    protected Byte[] file;

    /**
     * Constructs a validated instance of {@link PostCollectionByIDThumbnailsV1B}.
     *
     * @param spec the specification to process
     */
    public PostCollectionByIDThumbnailsV1B(Consumer<PostCollectionByIDThumbnailsV1B> spec) {
        super();
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link PostCollectionByIDThumbnailsV1B}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #PostCollectionByIDThumbnailsV1B(Consumer)} instead.
     * @param file file
     */
    @ApiStatus.Internal
    public PostCollectionByIDThumbnailsV1B(Byte[] file) {
        this.file = file;
    }
}
